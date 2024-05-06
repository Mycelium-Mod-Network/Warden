package network.myceliummod.warden;

import com.sun.jndi.toolkit.url.Uri;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public final class ZoneIdentifier {

    private static final String ZONE_IDENTIFIER = ":Zone.Identifier";
    private static final String REFERRER_URL = "ReferrerUrl=";
    private static final String HOST_URL = "HostUrl=";

    @Nullable
    private final String host;

    @Nullable
    private final String referrer;

    private ZoneIdentifier(@Nullable String host, @Nullable String referrer) {

        this.host = host;
        this.referrer = referrer;
    }

    /**
     * Gets the url that the file was downloaded with.
     *
     * @return The url that the file was downloaded with, or null if that data is not available.
     */
    @Nullable
    public String getHost() {
        return this.host;
    }

    /**
     * Gets the referrer to the url that the file was downloaded with. For example if example.com redirects to
     * cdn.example.com this will give you example.com.
     *
     * @return The referrer to the url that the file was downloaded with, or null if that data is not available.
     */
    public String getReferrer() {
        return this.referrer;
    }

    @Override
    public String toString() {
        return "ZoneIdentifier{" + "host='" + host + '\'' + ", referrer='" + referrer + '\'' + '}';
    }

    /**
     * Get the zone identifier information for a file. This information is used by Windows to track where a file was
     * downloaded from and how it was downloaded.
     *
     * @param file The file to get the information of.
     * @return If the zone identifier exists it will be parsed and returned, otherwise this will be null.
     */
    @Nullable
    public static ZoneIdentifier of(File file) {
        // We are using the NIO file API because the paths API does not support ADS and the attributes
        // API made the program 9x slower.
        final File zoneFile = new File(file.getAbsolutePath() + ZONE_IDENTIFIER);
        if (zoneFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(zoneFile))) {
                String host = null;
                String referrer = null;
                String line;
                while ((line = reader.readLine()) != null && (referrer == null || host == null)) {
                    if (line.startsWith(REFERRER_URL)) {
                        referrer = stripInfo(line.substring(REFERRER_URL.length()));
                    }
                    else if (line.startsWith(HOST_URL)) {
                        host = stripInfo(line.substring(HOST_URL.length()));
                    }
                }
                return new ZoneIdentifier(host, referrer);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    /**
     * Attempts to strip the protocol and path from the domain. This is like {@link Uri#getHost()} but slightly faster.
     *
     * @param urlString
     * @return The stripped string, or the input string if info could not be stripped.
     */
    private static String stripInfo(String urlString) {
        // TODO In production urls usually have a protocol and a path but additional safeguards would be nice.
        int startIdx = urlString.indexOf("://");
        if (startIdx != -1) {
            startIdx += 3;
            int endIdx = urlString.indexOf('/', startIdx);
            if (endIdx != -1) {
                return urlString.substring(startIdx, endIdx);
            }
        }
        return urlString;
    }
}
