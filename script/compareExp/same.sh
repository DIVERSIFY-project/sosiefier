#!/bin/sh
#$1 jar and log directory (full path)
#$2 originalDiffToExclude (full path)
#$3 original log (full path)
#$4 script directory (full path)

cd $1
rm excludeDiff
for sosie in $(ls)
do
    cp $2 excludeDiff

    cp $4/compare.properties tmp.properties
    echo dirOriginal=$3 >> tmp.properties
    echo result=$1 >> tmp.properties
    echo dirSosie=$1/$sosie/log/1/ >> tmp.properties

    java -Xmx4000m -cp $4/../../target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.compare.Main tmp.properties

    cp $4/compare.properties tmp.properties
    echo dirOriginal=$3 >> tmp.properties
    echo result=$1 >> tmp.properties
    echo dirSosie=$1/$sosie/log/2/ >> tmp.properties

    java -Xmx4000m -cp $4/../../target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.compare.Main tmp.properties


#  rm tmp.properties

    mv excludeDiff $1/$sosie/diff
done
