.SILENT:

default: clean setup .java.class

run-legacy:
	java -cp ./out com.blueskyline.characterisationtests.LegacyCrud

clean:
	rm -rf ./out

setup:
	mkdir out

.java.class:
	javac -d out *.java
