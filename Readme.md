# ANT Java Builder

The Project AntJavaBuilder is a collection build.xml files for apache ANT, with the purpose to build java projects in an
entirely generic way. The builder supports an **incremental build UID**, build **timestamp** and pre-compilation 
replacement of **user-defined tokens** inside source/resource/script files (e.g. for version ID, project name, build 
timestamp etc.). It also supports **multiple deployment strategies** for one build cycle (development, test, 
integration, production).

## Requirements

In order to function properly, the following binaries are needed from the Apache Software foundation:

* Apache ANT: [latest version](https://ant.apache.org/bindownload.cgi)
* ANT contrib: [version 0.6](https://sourceforge.net/projects/ant-contrib/files/ant-contrib/ant-contrib-0.6/)

> NB: Copy "ant-contrib-0.6.jar" to: *"your-ANT-install-directory/lib"*, you may also use any later version. If you
need a tutorial for installing ANT, use [this site](https://www.mkyong.com/ant/how-to-install-apache-ant-on-windows/).

## Projects

### Project: BuildFile

This is the build.xml made for single deployment. Use this if you are not planning to deploy your project on multiple
environments.

### Project: BuildFile_MultiEnv

This is the build.xml made for deployment to multiple environments. Each environment (optionaly) contains it's own
library, script and resource folder. Use this if you are planning to deploy your project on multiple environments such
as: development, test, integration, production.

## Usage

### Use case: New Project

**Fetch Build files:**
Either use the project "BuildFile" to create a single deployable file, or use the project "BuildFile_MultiEnv" for
deployment to four different environments: development, testing, integration, production.

> Copy the according files "build.xml" and "build.properties" to your new project's root directory. 

**Update properties file:**
The build.xml doesn't need to be modified in most of the cases, (this was the main purpose of the project) the 
project/build specific details are set inside the file "build.properties". 

> Set the according version numbers as well as the project/build specific settings (input/output directories). Don't 
forget to set the main class (main.class) of your project.

**Build and Run your project:**
The build file for single deployment contain 3 Tasks:

* build: Build your project, create a deployable zip
* run: Run your project after build
* cr: "compile-run" Build your project, then run it

The build file for multi deployment has some additional tasks:

* dev: Run your project with development configuration
* test: Run your project with test configuration
* int: Run your project with integration (staging/preproduction) configuration
* prod: Run your project with production configuration
* NB: Default action for "run" is "dev", goes as well for "cr"

> type: "ant build" (or "ant cr") in your console to compile (and run) your project.

## License

This project was created by the community for the community, it made to be free from licenses and belongs to the public.

No donations are accepted here, donations go to the 
[Apache Software foundation](https://www.apache.org/foundation/contributing.html) for realising ANT and ANT contrib.

## TODO

* Shared logic for single and multi deployment:
    * User defined environments possible TBD...
* User defined tokens (e.g. 5)
    * Create variables
    * Update replace
