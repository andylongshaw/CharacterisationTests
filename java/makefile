.SILENT:

default: clean setup .java.class

run-legacy:
	java -cp ./out:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar com.blueskyline.characterisationtests.LegacyCrud

test-legacy:
		java -cp ./out:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar com.blueskyline.characterisationtests.CharacterisationTestForLegacyCrud

clean:
	rm -rf ./out

setup:
	mkdir out

.java.class:
	javac -cp ./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar -d out *.java
