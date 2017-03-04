.SILENT:

default: clean setup .java.class

run:
	java -cp ./out com.blueskyline.characterisationtests.LegacyCrud

clean:
	rm -rf ./out

setup:
	mkdir out

.java.class:
	javac -d out *.java
