JUNIT=lib/junit-platform-console-standalone-1.2.0.jar
RUNNER=org.junit.platform.console.ConsoleLauncher
CHECKSTYLE=lib/checkstyle-5.5-all.jar
STYLE_PATH=assets/xml/mystyle.xml
PKG=src/

default:
	@echo "usage: make target"
	@echo "4 availabe targets: clean - removes .class files"
	@echo "___compile - builds from source"
	@echo "___test - runs JUnit5 tests"
	@echo "___check - ruins your life with checkstyle"
	


compile:
	javac -cp 'bin/*:lib/*' -d ./bin src/*.java


test:
	mv src/* .; mv bin/* .; mv $(JUNIT) .
	jar cf Tests.jar *.class
	ls
	java -cp '.:Tests.jar:junit-platform-console-standalone-1.2.0.jar' $(RUNNER)  --select-class CadCoinMintTest --select-class CoinTest --select-class UsdCoinMintTest

replace:
	mv *.class bin; mv *.java src; mv junit-platform-console-standalone-1.2.0.jar lib

demo: bin/Demo.class
	java -classpath bin Demo 

clean:
	rm -rf ./bin/*.class

check:
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./src/*.java
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./test/*.java
