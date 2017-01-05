# BlackJack

Note: If you get any messages along the lines of `"You cannot save this document with extension ".tar" at the end of the name.
The required extension is ".gz".` choose the 'Use Both" option.

## General Commands Reference
These commands will be run from the command line.  
Note: the easiest way to access the command line for a Mac is to `⌘-space`, type then select `terminal`.  

### Linux Commands
  - `pwd` - show current path
  - `ls (-la)`  - show files in folder
  - `cd ..` - move back one folder
  - `cd ‘name of folder’` - move to folder in current directory

### Tomcat Commands
 - **Start the Tomcat Server**- from **`/Library/tomcat/`** run the command:  
   `bin/startup.sh && tail -f logs/catalina.out`
 - **Stop the Tomcat Server**- from **`/Library/tomcat/`** run the command:  
   `bin/shutdown.sh && tail -f logs/catalina.out`
 - **Verify the Tomcat install**:
   In browser go to url [localhost:8080/examples/index.html](localhost:8080/examples/index.html)

## Install JDK and Tomcat
1. Download and install the Java Development Kit (JDK):
  1. http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  2. Under "Java SE Development Kit 8u111", click "Accept License Agreement"
  3. Choose the "Mac OS X" version download file (e.g. dk-8u111-macosx-x64.dmg)
  4. When the download is complete, double-click the downloaded .dmg to extract it
  5. When the JDK Update window opens (in Finder) double-click the .pkg file (e.g. "JDK 8 Update 111.pkg") and follow the instructions to install the JDK
  6. Close the JDK Update wGetting indow
2. Download and install the Tomcat Server
  1. http://tomcat.apache.org/download-80.cgi
  2. Choose 8.5.9 > Binary Distributions > Core > tar.gz
  3. Open Finder, in downloads, click on apache-tomcat-8.5.9.tar.gz to extract the contents
  4. In Macintosh HD (if this does not show up, go to Finder/preferences/Devices/click "MacBook HD")
  5. In your user `/Library/` make a new directory called "Tomcat"
     1. `cd ~/Library` - move into, i.e. change to, your Library directory
     2. `mkdir Tomcat` - make a new directory in your current directory named "Tomcat"
  6. Move the **_contents_** of `apache-tomcat-8.5.9` into the `/library/Tomcat` folder   
     NOTE: do not copy the apache-tomcat-8.5.9 parent folder, just the contents.  
  7. Change ownership of the /Library/Tomcat folder hierarchy: sudo chown -R <your_username> /Library/Tomcat
  8. Make all scripts executable: sudo chmod +x /Library/Tomcat/bin/*.sh
  9. Start the server and verify the install (see [Tomcat Commands](https://github.com/kelliet/BlackJack#tomcat-commands) above)
  
   
## Getting the BlackJack project started
 1. create a GitHub account: www.github.com
 2. go to https://github.com/kelliet/BlackJack
 2. Set-up a webapp directory for your game
    1. `cd ~/Library/tomcat/webapps` - move into Tomcat's webapps folder
    2. `mkdir BlackJack` - create a directory for the BlackJack game
    3. `cd BlackJack` - move into your newly created BlackJack folder
    2. make two more new folders under BlackJack: META-INF and WEB-INF
    3. create the following folders under WEB-INF
      1. `classes`
        1. create the following folder under classes
          1. `com`
            1. create the following folder under com
              1. `company`
  4. create 3 new java files in the classes/com/company folder.  For each .java file, copy the java code from the corresponding file in Github
    - Main.java
    - MainController.java
    - Card.java
  5. Compile each .java class using javac, for example javac Main.java
  6. Start tomcat - see above
  7. In your browser, type http://localhost:8080/blackjack
