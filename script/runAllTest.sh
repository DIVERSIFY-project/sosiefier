#!/bin/sh

for i in `cat $1`
do

    echo jacocoFileName=$i > jacoco.properties
    mvn -Dtest=$i test
done
