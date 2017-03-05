# Java example of Characterisation Test wrapper

### Contents
This directory contains an example of how you might wrap a legacy Java class in a characterisation test. It consists of:

* LegacyCrud.java - a simple file representing some badly written legacy code including lots of System.out.println calls

* legacy_output.txt - the output from running LegacyCrud captured in a text file

* CharacterisationTestForLegacyCrud.java - an example characterisation test for LegacyCrud that runs it and compares the output to the contents of legacy_output.txt

* A makefile to drive these things

### Pre-reqs
To run this you will need junit-4.12.jar and hamcrest-core-1.3.jar in ./lib, both of which are readily available on https://search.maven.org/

### Make targets
You may find the following make targets useful:

* make - cleans and re-creates the output folder (./out) and compiles the .java files

* make run-legacy - runs the LegacyCrud Java app

* make test-legacy - runs the CharacterisationTestForLegacyCrud test class using junit

### And finally...
There are undoubtedly many improvements that could be made, If you have any suggestions then please issues a pull request or drop me a line on Twitter @andylongshaw
