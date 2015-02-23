#!/bin/sh
cpu=$(cat nbProcess)
for i in `seq 1 $1`
do
    for j in `seq 1 $cpu`
    do
        java -Djava.library.path=lib -Xmx8000m  -Dhttp.proxyHost=proxy.rennes.grid5000.fr  -Dhttps.proxyPort=3128 -Dhttps.proxyHost=proxy.rennes.grid5000.fr  -Dhttp.proxyPort=3128  -jar generator/target/generator-1.0.0-SNAPSHOT-jar-with-dependencies.jar $(cat propertiesFile) >  out_$i_$j &
    done
    wait
    killall java
done
