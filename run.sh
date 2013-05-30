#!/bin/sh

for i in {1..10}
do
    java -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar -src $1 -jacoco $2 -nbRun $3 -out $4

    killall java
done
