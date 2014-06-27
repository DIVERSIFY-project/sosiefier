#!/bin/sh
#$1 project directory (full path)
#$2 excludeDiff file (full path)

cd $1
cp $2 excludeDiff

touch excludeDiff

touch same.properties
echo project=$(pwd) > same.properties
echo dirOriginal=$(pwd)/log >> same.properties
echo dirSosie=$(pwd)/logOld >> same.properties
echo result=$(pwd) >> same.properties
echo logTrace=same >> same.properties
echo excludeDiff=excludeDiff >> same.properties

sizeOld="1"
sizeNew="2"
mkdir logOld
while [ "$sizeOld" -ne "$sizeNew" ]
do
    sizeOld=$( wc -m < excludeDiff)
    rm logOld


    rm logOld/*
    cp log/* logOld/
    rm log/*
    cp logOld/id log/id

    mvn clean test

    rm -r log/logThread-*
    rm -r log/logTime-*
    rm -r log/logpool-*
    rm -r log/logFinalizer*


    java -Xmx4000m -cp ~/Documents/code/sosies-generator/target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.compare.Main same.properties

    echo previousReport=report.json >> same.properties

    sizeNew=$( wc -m < excludeDiff)
    echo $sizeNew
    echo $sizeOld
done

rm same.properties
