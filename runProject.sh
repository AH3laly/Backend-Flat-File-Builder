#!/usr/bin/bash

sourceFile="$PWD/app/src/main/resources/mapping.xml"
outputFile="$PWD/app/src/main/resources/outputFile.txt"

gradle build
echo Converting Flat file of $sourceFile ...
gradle run --args="$sourceFile $outputFile"
echo Flat file created: $outputFile
