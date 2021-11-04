JUNIT=./lib/junit-platform-console-standalone-1.2.0.jar
RUNNER=org.junit.platform.console.ConsoleLauncher
CHECKSTYLE=lib/checkstyle-5.5-all.jar
STYLE_PATH=assets/xml/mystyle.xml

default:
	@echo "usage: make target"
	@echo "4 availabe targets: clean - removes .class files"
	@echo "___compile - builds from source"
	@echo "___test - runs JUnit5 tests"
	@echo "___check - ruins your life with checkstyle"
	

compile-all:
	javac -d ./bin src/*.java
	javac -d ./bin -cp .:bin:$(JUNIT) test/*.java

compile-src:
	javac -d ./bin src/*.java

compile-tests: $(JUNIT)
	javac -cp .:$(JUNIT):bin/* -d ./bin ./test/*.java 

test: $(JUNIT)
	java -cp .:$(JUNIT) $(RUNNER) --scan-class-path 

demo: Demo.java
	java Demo

clean:
	rm -rf ./bin/*.class

check:
	java -jar $(CHECKSTYLE) -c $(STYLE_PATH) ./src/*.java
