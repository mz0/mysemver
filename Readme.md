This is a HelloWorld-class program that shows its build (semver) number

You may look at [GitVersion](https://gitversion.readthedocs.io) and get the idea ) 

Here the goal is to generate 'Implementation-Build' attribute in Gradle's 
configuration phase and read it at run time.
The build.properties is here for history only and is not printed as initially intended.

This is a POC with fixed version string a.t.m.

### Running

```
./gradlew jar
java -jar build/libs/<TAB>MyVers-0.1-SNAPSHOT.jar
```
The thingy should output to console its build number.

mz@exactpro.com
Aug. 1, 2018
