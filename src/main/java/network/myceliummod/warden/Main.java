package network.myceliummod.warden;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        long start = System.nanoTime();
        // TODO add command args
        // TODO Load rules from file?
        // TODO Load rules from args?
        // TODO Disable default rules?
        final DomainRules rules = DomainRules.builtin();
        for (String arg : args) {
            try {
                if (!checkFile(rules, Paths.get(arg).toFile())) {
                    System.out.println("No matching files were found.");
                }
            }
            catch (InvalidPathException e) {
                throw new IllegalArgumentException("Invalid path specified. '" + arg + "'");
            }
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    /**
     * Check a file or directory recursively for files that were downloaded from a given list of domain rules.
     *
     * @param rules  The rules to match against.
     * @param target The target file. If the target is a directory it will be checked recursively.
     * @return True if one or more files checked were downloaded from a site matching the list of domain rules.
     */
    private static boolean checkFile(DomainRules rules, File target) {
        boolean hasMatch = false;
        if (!target.exists()) {
            throw new IllegalArgumentException("The file does not exist! '" + target.getAbsolutePath() + "'");
        }
        else if (target.isFile()) {
            final ZoneIdentifier zoneId = ZoneIdentifier.of(target);
            if (zoneId != null && rules.test(zoneId)) {
                System.out.println("File='" + target + "' host='" + zoneId.getHost() + "' referrer='" + zoneId.getReferrer() + "'.");
                hasMatch = true;
            }
        }
        else if (target.isDirectory()) {
            for (File subTarget : Objects.requireNonNull(target.listFiles())) {
                hasMatch = hasMatch || checkFile(rules, subTarget);
            }
        }
        return hasMatch;
    }
}