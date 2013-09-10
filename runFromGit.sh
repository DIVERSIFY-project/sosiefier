#!/bin/sh

java -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar git $2
cpu=$(cat nbCPU)
for i in `seq 1 $1`
do
    for j in `seq 1 $cpu`
    do
        java -Xmx2000m -XX:MaxPermSize=256m -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar $(cat propertiesFile) &
    done
    wait
    sh git/push.sh $2/diversify-exp
done
