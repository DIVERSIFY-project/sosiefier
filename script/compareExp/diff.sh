#!/bin/sh
#$1 log directory (full path)
#$2 project directory (full path)
#$3 diff file directory (full path)
#$4 result directory (full path)
#$5 script directory (full path)

cd $1
for sosie in $(ls)
do
    rm  -r diff
    rm  -r tmp.properties
    rm  diff
    rm  tmp.properties
    cp $3/$sosie/diff diff
    cp $5/diff.properties tmp.properties
    echo project=$2 >> tmp.properties
    echo result=$4/$sosie >> tmp.properties
    echo dirOriginal=$2/logOriginal >> tmp.properties
    echo dirSosie=$sosie >> tmp.properties
    mkdir -p $4/$sosie
    touch excludeDiff

    java -Xmx4000m -cp $5/../../target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.compare.Main tmp.properties

    rm excludeDiff
    rm tmp.properties

done
