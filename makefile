JUNIT=./lib/junit-platform-console-standalone-1.2.0.jar
RUNNER=org.junit.platform.console.ConsoleLauncher

default:
	@echo "usage: make target"
	@echo "4 availabe targets: clean - removes .class files"
	@echo "___compile - builds from source"
	@echo "___test - runs JUnit5 tests"
	@echo "___check - ruins your life with checkstyle"
	

compile:
	javac -d ./bin src/*.java



test:
	java -cp .:$(JUNIT):./bin $(RUNNER) --scan-class-path 

demo: Demo.java
	java Demo

clean:
	rm -rf ./bin/*.class

check: mystyle.xml 
	mystyle.xml ./src/*.java
