
# Getting Started

Note: If you get any messages along the lines of `"You cannot save this document with extension “.tar” at the end of the name. The required extension is “.gz”.` choose the 'Use Both" option.

## Install JDK and Tomcat
1. Download and install the Java Development Kit (JDK):
  1. http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  2. Under "Java SE Development Kit 8u111", click "Accept License Agreement"
	3. Choose the "Mac OS X" version download file (e.g. dk-8u111-macosx-x64.dmg)
  4. When the download is complete, double-click the downloaded .dmg to extract it
  5. When the JDK Update window opens (in Finder) double-click the .pkg file (e.g. "JDK 8 Update 111.pkg") and follow the instructions to install the JDK
  6. Close the JDK Update window
2. Download Tomcat
  1. http://tomcat.apache.org/download-80.cgi
  2. Choose 8.5.9 > Binary Distributions > Core > tar.gz
  3. Open Finder, in downloads, click on apache-tomcat-8.5.9.tar.gz to extract the contents
  4. In Macintosh HD (if this does not show up, go to Finder/preferences/Devices/click "MacBook HD")		
	5. In `/library/` make a new directory called "tomcat"
  6. Move the **_contents_** of `apache-tomcat-8.5.9` into thte `/library/tomcat` folder   
    NOTE: do not copy the apache-tomcat-8.5.9 parent folder, just the contents.	

## Commands (will run from the command line)
### Linux Commands
  - `pwd` - show current path
	- `ls (-la)`  - show files in folder
	- `cd ..` - move back one folder
	- `cd ‘name of folder’` - move to folder in current directory

### Tomcat Commands
 - start tomcat
   1. from /library/tomcat/ run the command
	 2. `bin/startup.sh && tail -f logs/catalina.out`
 - stop tomcat
   1. from /library/tomcat/ run the command
	 2. `bin/shutdown.sh && tail -f logs/catalina.out`
 - verify tomcat install
   1. In browser go to url [localhost:8080/examples/index.html](localhost:8080/examples/index.html)
   
### Getting the BlackJack project started5.  
 1. Open the command line (e.g. Terminal in OS X)
 4. create a GitHub account: www.github.com
 5. go to https://github.com/kelliet/BlackJack
 6. in Finder /Library/Tomcat/webapps
    1. `cd /library/tomcat/webapps` - Move into Tomcat's webapps folder
    2. `mkdir BlackJack` - Create a directory for the BlackJack game
    2. make two more new folders under BlackJack: META-INF and WEB-INF
    3. create the following folders under WEB-INF
