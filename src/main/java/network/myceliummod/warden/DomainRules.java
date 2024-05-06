package network.myceliummod.warden;

import java.util.HashSet;
import java.util.Set;

/**
 * Holds the rules used to match a domain. Currently, rules can specify a domain and all subdomains, or a subdomain and
 * all nested subdomains.
 */
public class DomainRules {

    private final Set<Rule> rules = new HashSet<>();

    public static class Rule {

        protected final String domain;
        protected final String subdomain;

        public Rule(String domain) {
            this.domain = domain;
            // Matching subdomains was faster this way. This trades a bit of ram that will soon be freed
            // for a reduced execution time.
            this.subdomain = "." + domain;
        }
    }

    /**
     * Creates a new set of rules that contains a subset of the domains catalogued by the stop mod reposts org.
     *
     * @return A new set of the default rules.
     */
    public static DomainRules builtin() {

        final DomainRules rules = new DomainRules();
        rules.addRule("0x10c-zone.ru");
        rules.addRule("10minecraft.ru");
        rules.addRule("1minecraft.net");
        rules.addRule("1st-minecraft.ru");
        rules.addRule("24hminecraft.com");
        rules.addRule("2minecraft.info");
        rules.addRule("2minecraft.net");
        rules.addRule("3minecraft.com");
        rules.addRule("4minecraft.com");
        rules.addRule("5minecraft.com");
        rules.addRule("5minecraft.net");
        rules.addRule("6minecraft.net");
        rules.addRule("6minecraftmods.net");
        rules.addRule("7minecraft.net");
        rules.addRule("8minecraft.com");
        rules.addRule("8minecraft.org");
        rules.addRule("99minecraft.com");
        rules.addRule("9lifehack.com");
        rules.addRule("9minecraft.net");
        rules.addRule("9minecraftaz.blogspot.com");
        rules.addRule("9minecraftscom.blogspot.com");
        rules.addRule("9valheim.net");
        rules.addRule("all-mod-for-minecraft.blogspot.com");
        rules.addRule("all-mods.ru");
        rules.addRule("allforminecraft.ru");
        rules.addRule("allfreeapk.com");
        rules.addRule("aminecraft.net");
        rules.addRule("armscraft.ru");
        rules.addRule("atomcraft.ru");
        rules.addRule("blackspigot.com");
        rules.addRule("blockminecraft.com");
        rules.addRule("bnstbns.pro");
        rules.addRule("borealis.su");
        rules.addRule("c-raft.ru");
        rules.addRule("clubminecraftbr.blogspot.com");
        rules.addRule("comoinstalarmodsminecraft.com.br");
        rules.addRule("craftear.info");
        rules.addRule("crafthd.net");
        rules.addRule("craftzon.ru");
        rules.addRule("creeper.gg");
        rules.addRule("crystal-launcher.net");
        rules.addRule("cubixworld.ru");
        rules.addRule("cursefire.com");
        rules.addRule("datapacksminecraft.com");
        rules.addRule("day2play.pl");
        rules.addRule("dle01.sofftportall8nn.info");
        rules.addRule("dlminecraft.com");
        rules.addRule("dlminecraft.net");
        rules.addRule("dms.yt");
        rules.addRule("dosakh.ru");
        rules.addRule("download.com.vn");
        rules.addRule("download.komputerswiat.pl");
        rules.addRule("download.parcraftmc.com");
        rules.addRule("downloadape.org");
        rules.addRule("downloadatoz.com");
        rules.addRule("downloadminecraft4free.blogspot.com");
        rules.addRule("easymc.io");
        rules.addRule("eincraft.ru");
        rules.addRule("eminecraft.net");
        rules.addRule("en-minecraft.org");
        rules.addRule("esportsasia.com");
        rules.addRule("excalibur-craft.ru");
        rules.addRule("exe-craft.ru");
        rules.addRule("fabricmods.com");
        rules.addRule("faithful.team");
        rules.addRule("fastalts.com");
        rules.addRule("file-minecraft.com");
        rules.addRule("fileplanet.com");
        rules.addRule("finemine.ru");
        rules.addRule("fmcpe.com");
        rules.addRule("for-minecraft.com");
        rules.addRule("forminecrafters.ru");
        rules.addRule("free-mods.ru");
        rules.addRule("freedownloadminecraft.com");
        rules.addRule("freshminecraft.ru");
        rules.addRule("full-mod.ru");
        rules.addRule("galaxythecreative.blogspot.no");
        rules.addRule("game-roblox.ru");
        rules.addRule("gamefiles.de");
        rules.addRule("gamemodd.com");
        rules.addRule("gamemodding.com");
        rules.addRule("gamemodding.net");
        rules.addRule("gamepoint.su");
        rules.addRule("gamertise.net");
        rules.addRule("games-utilities.com");
        rules.addRule("gamewise.co");
        rules.addRule("getmod.ru");
        rules.addRule("gid-minecraft.ru");
        rules.addRule("giga.de");
        rules.addRule("godgames.ru");
        rules.addRule("grand-mine.ru");
        rules.addRule("grant88.pixnet.net");
        rules.addRule("greatray.ru");
        rules.addRule("guide-minecraft.com");
        rules.addRule("hackphoenix.com");
        rules.addRule("hcs.land");
        rules.addRule("hil.su");
        rules.addRule("hubicraft.com");
        rules.addRule("imperialcraft.ru");
        rules.addRule("jojomine.com");
        rules.addRule("jtrent238-hammermod.decanterreviews.zero.lpk7.com");
        rules.addRule("keepergames.ru");
        rules.addRule("kgamek.ru");
        rules.addRule("kingminecraftmod.com");
        rules.addRule("kingminecraftmod.net");
        rules.addRule("klpbbs.com");
        rules.addRule("lambdacore.ucoz.ru");
        rules.addRule("launcherfenix.com.ar");
        rules.addRule("launchershiginima.com");
        rules.addRule("legacymodpack.com");
        rules.addRule("legionminecraft.com");
        rules.addRule("lemoncraft.ru");
        rules.addRule("letragon.ru");
        rules.addRule("loadminecraft.ru");
        rules.addRule("loveminecraft.com");
        rules.addRule("mc-addons.com");
        rules.addRule("mc-download.com");
        rules.addRule("mc-mod.com");
        rules.addRule("mc-mod.net");
        rules.addRule("mc-mods.net");
        rules.addRule("mc-mods.org");
        rules.addRule("mc-pc.net");
        rules.addRule("mc-pe.net");
        rules.addRule("mc-premium.org");
        rules.addRule("mc-vn.net");
        rules.addRule("mc.ahgame.com");
        rules.addRule("mc.twrx.ru");
        rules.addRule("mcbedrock.com");
        rules.addRule("mcdownloads.ru");
        rules.addRule("mchacks.net");
        rules.addRule("mcleaks.net");
        rules.addRule("mcmap.cc");
        rules.addRule("mcmoddatabase.com");
        rules.addRule("mcmodkit.com");
        rules.addRule("mcmodspc.com");
        rules.addRule("mcmodteam.blogspot.com");
        rules.addRule("mcmodteam.blogspot.de");
        rules.addRule("mcmp.su");
        rules.addRule("mcpatcher.net");
        rules.addRule("mcpe-game.ru");
        rules.addRule("mcpe-minecraftmods.ru");
        rules.addRule("mcpe-planet.com");
        rules.addRule("mcpeaddons.com");
        rules.addRule("mcpebox.com");
        rules.addRule("mcpedl.org");
        rules.addRule("mcpefl.com");
        rules.addRule("mcpefun.com");
        rules.addRule("mcpemods.net");
        rules.addRule("mcskill.ru");
        rules.addRule("mi-mundo-minecraft.blogspot.no");
        rules.addRule("miinecraft.org");
        rules.addRule("mine-craft.ws");
        rules.addRule("mine-play.ru");
        rules.addRule("minecraft-all.com");
        rules.addRule("minecraft-area.ru");
        rules.addRule("minecraft-aventure.com");
        rules.addRule("minecraft-book.ru");
        rules.addRule("minecraft-cube.ru");
        rules.addRule("minecraft-dl.com");
        rules.addRule("minecraft-double.ru");
        rules.addRule("minecraft-downloads.com");
        rules.addRule("minecraft-en.ucoz.com");
        rules.addRule("minecraft-files.ru");
        rules.addRule("minecraft-flow.ru");
        rules.addRule("minecraft-forum.net");
        rules.addRule("minecraft-france.net");
        rules.addRule("minecraft-game.ru");
        rules.addRule("minecraft-home.ru");
        rules.addRule("minecraft-inside.com");
        rules.addRule("minecraft-inside.ru");
        rules.addRule("minecraft-installer.com");
        rules.addRule("minecraft-installer.de");
        rules.addRule("minecraft-item.ru");
        rules.addRule("minecraft-jobs.ru");
        rules.addRule("minecraft-loads.ru");
        rules.addRule("minecraft-max.net");
        rules.addRule("minecraft-modding.de");
        rules.addRule("minecraft-modi.ru");
        rules.addRule("minecraft-mods.pro");
        rules.addRule("minecraft-mods.ru");
        rules.addRule("minecraft-moscow.com");
        rules.addRule("minecraft-pocket.com");
        rules.addRule("minecraft-resourcepacks.com");
        rules.addRule("minecraft-sodeon.ru");
        rules.addRule("minecraft-wiki.com");
        rules.addRule("minecraft-zet.ru");
        rules.addRule("minecraft.diablo1.ru");
        rules.addRule("minecraft.org.pl");
        rules.addRule("minecraft.soft32.com");
        rules.addRule("minecraft11.com");
        rules.addRule("minecraft12.com");
        rules.addRule("minecraft15.my1.ru");
        rules.addRule("minecraft17.net");
        rules.addRule("minecraft20.ru");
        rules.addRule("minecraft5.net");
        rules.addRule("minecraft70.ru");
        rules.addRule("minecraftalpha.net");
        rules.addRule("minecraftapks.com");
        rules.addRule("minecraftbuildinginc.com");
        rules.addRule("minecraftch.ru");
        rules.addRule("minecraftdata.com");
        rules.addRule("minecraftdatablog.blogspot.de");
        rules.addRule("minecraftdl.com");
        rules.addRule("minecraftdls.com");
        rules.addRule("minecraftdownload.in");
        rules.addRule("minecraftdownloadaz.blogspot.com");
        rules.addRule("minecraftdownloadmod.blogspot.no");
        rules.addRule("minecraftdungeonsmod.com");
        rules.addRule("minecrafteando.com");
        rules.addRule("minecrafted.su");
        rules.addRule("minecrafteo.com");
        rules.addRule("minecraftermods.net");
        rules.addRule("minecraftes.com");
        rules.addRule("minecraftevi.com");
        rules.addRule("minecraftexe.com");
        rules.addRule("minecraftexpert.ru");
        rules.addRule("minecraftfc.com");
        rules.addRule("minecraftfile.com");
        rules.addRule("minecraftfive.com");
        rules.addRule("minecraftfly.ru");
        rules.addRule("minecraftforfreenow.net");
        rules.addRule("minecraftforged.com");
        rules.addRule("minecraftfreedownloadpro.blogspot.no");
        rules.addRule("minecraftfreemods.net");
        rules.addRule("minecraftgames.co.uk");
        rules.addRule("minecraftgig.ru");
        rules.addRule("minecraftgood.com");
        rules.addRule("minecrafthd.com");
        rules.addRule("minecrafthub.com");
        rules.addRule("minecrafthut.com");
        rules.addRule("minecraftiamodpack.blogspot.com");
        rules.addRule("minecraftiamods.com");
        rules.addRule("minecraftinc.com");
        rules.addRule("minecraftinstallers.com");
        rules.addRule("minecraftio.com");
        rules.addRule("minecraftium.ru");
        rules.addRule("minecraftmine.org");
        rules.addRule("minecraftmod.org");
        rules.addRule("minecraftmodapk.com");
        rules.addRule("minecraftmoddl.blogspot.com");
        rules.addRule("minecraftmodhub.weebly.com");
        rules.addRule("minecraftmods.biz");
        rules.addRule("minecraftmods.com.br");
        rules.addRule("minecraftmods9.blogspot.com");
        rules.addRule("minecraftmodsforums.weebly.com");
        rules.addRule("minecraftmodspc.com");
        rules.addRule("minecraftmodz.com");
        rules.addRule("minecraftmonster.ru");
        rules.addRule("minecraftmore.com");
        rules.addRule("minecraftnodus.do.am");
        rules.addRule("minecraftom.ru");
        rules.addRule("minecraftonly.ru");
        rules.addRule("minecraftore.com");
        rules.addRule("minecraftors.ru");
        rules.addRule("minecraftpatch.com");
        rules.addRule("minecraftpatch.ru");
        rules.addRule("minecraftpe-mods.com");
        rules.addRule("minecraftplanet.ru");
        rules.addRule("minecraftplus.org");
        rules.addRule("minecraftposts.net");
        rules.addRule("minecraftq.ru");
        rules.addRule("minecraftred.com");
        rules.addRule("minecraftresource.com");
        rules.addRule("minecrafts-mod.ru");
        rules.addRule("minecraftsemlimites.com");
        rules.addRule("minecraftside.com");
        rules.addRule("minecraftsix.com");
        rules.addRule("minecraftsone.blogspot.no");
        rules.addRule("minecraftspace.com");
        rules.addRule("minecraftstorage.com");
        rules.addRule("minecrafttexturepacks.com");
        rules.addRule("minecrafttime.com");
        rules.addRule("minecrafttube.net");
        rules.addRule("minecraftxl.com");
        rules.addRule("minecraftxz.com");
        rules.addRule("minecraftyard.com");
        rules.addRule("minecraftym.ru");
        rules.addRule("minecube.su");
        rules.addRule("minedown.com");
        rules.addRule("minefan.ru");
        rules.addRule("mineplanet.net");
        rules.addRule("minerussia.ru");
        rules.addRule("minesters.com");
        rules.addRule("minethatcraft.com");
        rules.addRule("mineturk.com");
        rules.addRule("minezona.ru");
        rules.addRule("minhvietltd.com");
        rules.addRule("mir-crafta.ru");
        rules.addRule("mirvideogames.ru");
        rules.addRule("mncraftmods.ru");
        rules.addRule("mod-minecraft.net");
        rules.addRule("mod-minecraft.ru");
        rules.addRule("mod4minecraft.com");
        rules.addRule("modcraft.su");
        rules.addRule("moddingames.wordpress.com");
        rules.addRule("moddrop.com");
        rules.addRule("moddrops.weebly.com");
        rules.addRule("modfast.ru");
        rules.addRule("modminecraft.com");
        rules.addRule("modminecrafts.com");
        rules.addRule("modov-minecraft.net");
        rules.addRule("mods-craft.ru");
        rules.addRule("mods-minecraft.ru");
        rules.addRule("modscraft.net");
        rules.addRule("modscraft.ru");
        rules.addRule("modsforminecraft.org");
        rules.addRule("modsline.com");
        rules.addRule("modsmc.com");
        rules.addRule("modsminecraft.com");
        rules.addRule("modsofminecraft.com");
        rules.addRule("modsx.ru");
        rules.addRule("mody4mine.ru");
        rules.addRule("monster-mcpe.com");
        rules.addRule("mooks.ru");
        rules.addRule("myfreemediacloudone.com");
        rules.addRule("network.vgchartz.com");
        rules.addRule("newfastmediasearcherfive.com");
        rules.addRule("nextminecraft.ru");
        rules.addRule("nexus-mods.com");
        rules.addRule("niceminecraft.net");
        rules.addRule("o-crafte.ru");
        rules.addRule("ofminecraft.ru");
        rules.addRule("ogmcdownload.com");
        rules.addRule("old-minecraft.ru");
        rules.addRule("oneland.su");
        rules.addRule("only-minecraft.ru");
        rules.addRule("onlycraft.ru");
        rules.addRule("onminecraft.ru");
        rules.addRule("optifine.es");
        rules.addRule("optifine.fr");
        rules.addRule("optifine.info");
        rules.addRule("optifine.online");
        rules.addRule("optifine.vip");
        rules.addRule("optifined.com");
        rules.addRule("packs548.rssing.com");
        rules.addRule("pandoriacraft.ru");
        rules.addRule("pcminecraft-mods.com");
        rules.addRule("pd19.org");
        rules.addRule("pentacraft.ru");
        rules.addRule("pimpminecraft.com");
        rules.addRule("pixelmon.pro");
        rules.addRule("planet-m.net");
        rules.addRule("planet-mc.net");
        rules.addRule("planetaminecraft.com");
        rules.addRule("planetlemoncraft.com");
        rules.addRule("playways.ru");
        rules.addRule("q-craft.ru");
        rules.addRule("qoobworld.ru");
        rules.addRule("realmine.net");
        rules.addRule("redserver.su");
        rules.addRule("resource-pack.com");
        rules.addRule("resourcepack.info");
        rules.addRule("resourcepacks24.de");
        rules.addRule("revozin.com");
        rules.addRule("rinoyundaapk.blogspot.no");
        rules.addRule("rockybytes.com");
        rules.addRule("ru-m.org");
        rules.addRule("ru-minecraft.ru");
        rules.addRule("ru-minecrafty.ru");
        rules.addRule("secure.downloadfp.com");
        rules.addRule("setcraft.ru");
        rules.addRule("shadersmod.download");
        rules.addRule("sharemods.com");
        rules.addRule("simpleminecraft.ru");
        rules.addRule("simplesminecraft.blogspot.com.br");
        rules.addRule("skins-minecraft.net");
        rules.addRule("skydaz.com");
        rules.addRule("skyworxz.com");
        rules.addRule("soft32.com");
        rules.addRule("softonic.com");
        rules.addRule("space-games.ucoz.ru");
        rules.addRule("squareland.ru");
        rules.addRule("stoninho.blogspot.com.br");
        rules.addRule("streamcraft.net");
        rules.addRule("svida.org");
        rules.addRule("texture-packs.com");
        rules.addRule("texturespack.com");
        rules.addRule("the-minecraft.fr");
        rules.addRule("thealtening.com");
        rules.addRule("tlauncher-legacy.ru");
        rules.addRule("tlauncher.org");
        rules.addRule("tlauncherminecraft.com");
        rules.addRule("todocraft.net");
        rules.addRule("topminecraftmods.com");
        rules.addRule("ultimateminecraftlj.weebly.com");
        rules.addRule("uminecraft.at.ua");
        rules.addRule("utk.io");
        rules.addRule("vam-polezno.ru");
        rules.addRule("victorycraft.ru");
        rules.addRule("vimeworld.ru");
        rules.addRule("vlauncher.net");
        rules.addRule("vminecraft.ru");
        rules.addRule("vminecrafte.ru");
        rules.addRule("vodafoneuksignal.com");
        rules.addRule("wc3-maps.ru");
        rules.addRule("wemine.ru");
        rules.addRule("wikiminecraft.com");
        rules.addRule("wizardhax.com");
        rules.addRule("wminecraft.com");
        rules.addRule("wminecraft.net");
        rules.addRule("wmlcloud.com");
        rules.addRule("worldofminecraft.com");
        rules.addRule("worldofmods.com");
        rules.addRule("wpminecraft.blogspot.com");
        rules.addRule("xn--80aaycfjjdyvv.xn--p1ai");
        rules.addRule("yaminecraft.ru");
        rules.addRule("yourfreegamesnow.com");
        rules.addRule("yourminecraft.com");
        rules.addRule("zerocraft.ru");
        rules.addRule("zinchat.com");
        rules.addRule("zonacraft.net");
        return rules;
    }

    public void addRule(String domain) {
        this.addRule(new Rule(domain));
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    /**
     * Checks if the host or referrer of an identifier is matched.
     *
     * @param identifier The zone identifier to test.
     * @return If the identifier matched a rule.
     */
    public boolean test(ZoneIdentifier identifier) {
        return identifier != null && (testDomain(identifier.getReferrer()) || testDomain(identifier.getHost()));
    }

    /**
     * Tests if a domain or subdomain matches a rule.
     *
     * @param domain The domain to test.
     * @return If the domain matched a rule.
     */
    public boolean testDomain(String domain) {
        if (domain != null) {
            for (Rule rule : this.rules) { // This was significantly faster than streams.
                if (domain.equals(rule.domain) || domain.endsWith(rule.subdomain)) {
                    return true;
                }
            }
        }
        return false;
    }
}