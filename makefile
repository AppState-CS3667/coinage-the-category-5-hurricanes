JUNIT=lib/junit-platform-console-standalone-1.2.0.jar
RUNNER=org.junit.platform.console.ConsoleLauncher
CHECKSTYLE=checkstyle-5.5-all.jar
STYLE_PATH=assets/xml/mystyle.xml
PKG=src/

default:
	@echo "usage: make target"
	@echo "4 availabe targets: clean - removes .class files"
	@echo "___compile - builds from source"
	@echo "___test - runs JUnit5 tests"
	@echo "___check - ruins your life with checkstyle"
	


compile:
	javac -cp '.:$(JUNIT)' -d bin src/*.java



test: 
	jar cf bin/Test.jar bin/*.class
	java -cp 'bin:$(JUNIT):bin/Tests.jar' $(RUNNER) --scan-class-path 

demo:
	java Demo 

clean:
	rm -rf *.class

check:
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./src/*.java
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./test/*.java
