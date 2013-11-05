#!/bin/sh
cpu=$(cat nbProcess)
for i in `seq 1 $1`
do
    for j in `seq 1 $cpu`
    do
        sleep 2
        java -Xmx2000m -XX:MaxPermSize=256m -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar $(cat propertiesFile) >  out_$i_$j &
    done
    wait
    sh git/push.sh $2/diversify-exp
done
