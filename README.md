# BlackJack

Note: If you get any messages along the lines of `"You cannot save this document with extension ".tar" at the end of the name.
The required extension is ".gz".` choose the 'Use Both" option.

# Set-up the machine (note this is for Macs)
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
    - In `/library/` make a new directory called "tomcat"
  - Move `apache-tomcat-8.5.9/contents` from `/downloads/apache-tomcat-8.50/contents` to `/library/tomcat` folder 
    NOTE: do not copy the apache-tomcat-8.5.9 parent folder, just the contents.    
5. Open Terminal
6. `cd /library/tomcat/webapps` - Move into Tomcat's webapps folder
7. `mkdir BlackJack` - Create a directory for the BlackJack game

# Commands
## Linux Commands
  - `pwd` - show current path
    - `ls (-la)`  - show files in folder
    - `cd ..` - move back one folder
    - `cd 'name of folder'` - move to folder in current directory

## Tomcat Commands
 - start tomcat
   1. from /library/tomcat/ run the command
     2. `bin/startup.sh && tail -f logs/catalina.out`
 - stop tomcat
   1. from /library/tomcat/ run the command
     2. `bin/shutdown.sh && tail -f logs/catalina.out`
 - verify tomcat install
   1. In browser go to url [localhost:8080/examples/index.html](localhost:8080/examples/index.html)
   
## Getting the BlackJack project started
 1. create a GitHub account: www.github.com
 2. go to https://github.com/kelliet/BlackJack
 3. in Finder /Library/Tomcat/webapps
    1. create a new folder BlackJack
    2. create two new folders under BlackJack: META-INF and WEB-INF
    3. create the following folder under WEB-INF
      1. classes
        1. create the following folder under classes
          1. com
            1. create the following folder under com
              1. company
  4. create 3 new java files in the classes/com/company folder.  For each .java file, copy the java code from the corresponding file in Github
    1. Main.java
    2. MainController.java
    3. Card.java
  5. Compile each .java class using javac, for example javac Main.java
  6. Start tomcat - see above
  7. in your browser, type http://localhost:8080/blackjack
