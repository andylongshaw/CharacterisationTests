.SILENT:
JUNITLIBS = ./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar
JUNITRUNNER = org.junit.runner.JUnitCore

default: clean setup .java.class

run-legacy: default
	java -cp ./out:$(JUNITLIBS) com.blueskyline.characterisationtests.LegacyCrud

capture-legacy: default
		java -cp ./out:.$(JUNITLIBS) com.blueskyline.characterisationtests.LegacyCrud > legacy_output.txt


test-legacy: default
		java -cp ./out:$(JUNITLIBS) $(JUNITRUNNER) com.blueskyline.characterisationtests.CharacterisationTestForLegacyCrud

clean:
	rm -rf ./out

setup:
	mkdir out

.java.class:
	javac -cp $(JUNITLIBS) -d out *.java
