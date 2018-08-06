### This is a HelloWorld-class Spring Boot 2 App that shows its build number

build.gradle passes that as well as some arbitrary properties to Boot's buildInfo
(you may find them in the JAR's BOOT-INF/classes/META-INF/build-info.properties)
which HomeController reads at run time.

### Running

```
./gradlew
```
The thingy starts Netty which responds to http://localhost:8080 (build number e.g. v15.9ee999a)
or to localhost:8080?name=Foo.

mz@exactpro.com

Aug. 6, 2018
