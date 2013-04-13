Open Electribe Editor
=================================================


### Info ###

Open Electribe Editor (formerly known as ESX Wave Organizer)
is a program that allows you to organize, edit, and create .esx 
files for the Korg ESX-1. It is actively being developed, and 
is available on Windows, Linux, and Mac for free download 
[here](http://code.google.com/p/open-electribe-editor/downloads/list). 


### Links ###

- [Downloads](http://code.google.com/p/open-electribe-editor/downloads/list) 

- [Homepage](http://skratchdot.com/projects/open-electribe-editor/) 

- [Discussion Group / Forum](http://groups.google.com/group/open-electribe-editor) 

- [Bug Reports / Feature Requests](https://github.com/skratchdot/open-electribe-editor/issues) 

- [Javadocs](http://skratchdot.com/projects/open-electribe-editor/javadocs/)

- [Wiki](https://github.com/skratchdot/open-electribe-editor/wiki)


### Download Requirements ###
Java 1.6 must be installed for this program to work properly.
To download the latest version of Java, visit:  
[http://www.java.com/en/download/manual.jsp](http://www.java.com/en/download/manual.jsp) 


### Disclaimer ###
Remember to back up all your .esx files before using this program.
It is not affiliated with or supported by Korg in any way. Use at 
your own risk.


### Donate/Support ###
If you find the program useful, or feel like helping support 
it's development, you can donate via paypal by clicking the 
button below:  

[![DONATE](https://www.paypal.com/en_US/i/btn/btn_donate_LG.gif "DONATE")](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=8BBLHK3CBSWQE)


### Credits / Development Tools / Links ###

- [Eclipse](http://www.eclipse.org/) - The IDE used to develop this program. Also, this product is based on Eclipse's Rich Client Platform (RCP).

- [EMF](http://www.eclipse.org/modeling/emf/) - The Framework used to model .esx files (as well as RIFF .wav files)

- [jLayer](http://www.javazoom.net/javalayer/javalayer.html) - An open source MP3 library for the Java Platform

- [Korg](http://www.korg.com/) - The manufacturer of the Electribe Series sampler ESX-1.

_The following 2 hex editors helped me reverse engineer the .esx file format:_

- [HxD](http://mh-nexus.de/en/hxd/) - The Hex Editor I use to do file comparisons.

- [MiTeC HexEdit](http://www.mitec.cz/hex.html) - I used this for the hex calculator, and for the data display views/functions. 

_More about the Esx File Format:_

- [Esx File Format](http://skratchdot.com/projects/open-electribe-editor/javadocs/index.html?com/skratchdot/electribe/model/esx/EsxFile.html)


### Version History ###

#### v1.2.0 - Released April 13, 2013 ####

- \[[BUG: #27](https://github.com/skratchdot/open-electribe-editor/issues/27)\] Pattern Import not working when source pattern contains empty samples

#### v1.1.0 - Released January 6, 2013 ####

- \[[BUG: #11](https://github.com/skratchdot/open-electribe-editor/issues/11)\] Imports/Exports showing up twice in context menu

- \[[BUG: #12](https://github.com/skratchdot/open-electribe-editor/issues/12)\] Auto scroll when using context menu.

- \[[BUG: #21](https://github.com/skratchdot/open-electribe-editor/issues/21)\] Can't Save and problems to import Patterns

- \[[BUG: #22](https://github.com/skratchdot/open-electribe-editor/issues/22)\] Stereo samples not saving correctly. Mono samples not playing correctly.

- \[[FEATURE REQUEST: #18](https://github.com/skratchdot/open-electribe-editor/issues/18)\] Add functions for selecting unused items.

- \[[FEATURE REQUEST: #23](https://github.com/skratchdot/open-electribe-editor/issues/23)\] Make IsLoop? more clear for stereo samples.

- removing unused command: "Export Selected Audio Files"

- AudioPlayer no longer hangs, or becomes unresponsive.

#### v1.0.4 - Released June 3, 2012 ####

- \[[BUG: #15](https://github.com/skratchdot/open-electribe-editor/issues/15)\] Fixed a bug that prevented valid 16-bit PCM wave files from loading

#### v1.0.3 - Released September 10, 2011 ####

- \[[FEATURE REQUEST: #3](https://github.com/skratchdot/open-electribe-editor/issues/3)\] Added the ability to import patterns from other .esx files

- \[[TODO: #13](https://github.com/skratchdot/open-electribe-editor/issues/13)\] Added "reset perspective" functionality

- \[[TODO: #14](https://github.com/skratchdot/open-electribe-editor/issues/14)\] Fixed unclear message when dragging audio files

- \[[BUG: #10](https://github.com/skratchdot/open-electribe-editor/issues/10)\] Fixed rounding issue when setting SampleTune

#### v1.0.2 - Released March 21, 2011 ####

- Pattern Tab improvements:
  1. Can drag-and-drop patterns
  2. Adding "Pattern Editor" tab
  3. Adding "FX" tab
  4. Adding "Parts" tab
  5. Adding "Motion Sequences" tab
  6. Can move patterns around without changing what songs they are used in.

- Sample Tab improvements:
  1. Adding "Pattern/Part Usage" tab
  2. Can move samples around without changing what patterns they are used in.

- Song Tab improvements:
  1. Improving Song Event display (more human readable now)

- Fixing Typos

- Adding Sample/Pattern labels that show number & name

- Adding Tempo validation

#### v1.0.1 Beta - Released April 25, 2010 ####

- Splash screen works

- Changing the required Java version to J2SE-1.5 (so Older Macs are supported)

- Marking a few property labels/values as READ_ONLY

#### v1.0.0.Beta - Released March 9, 2010 ####

- Initial Release

- Patterns Tab is incomplete

- Song Events tab is incomplete
