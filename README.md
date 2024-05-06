# Warden
Detects Minecraft mod files that have been downloaded from untrustworthy 
sources and warns users of the potential dangers of doing so. This tool aims to
both educate and protect users from these malicious actors.

## Dangers of untrustworthy mod sites

- These sites often have outdated versions of mods. Outdated versions may contain bugs, vulnerabilities, or exploits that have already been patched.
- These sites often lie about what versions of Minecraft a mod is compatible with. This creates a bad user experience and risks user files being damaged or corrupted.
- These sites have a long history of infecting users with malware. This is usually done through malicious advertisements however there are documented cases of these websites repackaging malware inside of the mod files.

## Usage Guide
This project is in the early stages of development. Currently it only offers a 
command line interface that can check and find files downloaded from untrusty 
rehosting sites. 

### CLI 

#### `java -jar Warden.jar path/to/file/or/directory`
This command will check a specific file or all subfiles in the case of a 
directory. The current logic will recursively check all subfolders as well.