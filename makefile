JUNIT=./lib/junit-platform-console-standalone-1.2.0.jar
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


test: $(JUNIT)
	java -cp .:$(JUNIT) $(RUNNER) --scan-class-path 

demo: bin/Demo.class
	java -classpath bin Demo 

clean:
	rm -rf ./bin/*.class

check:
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./src/*.java
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./test/*.java
