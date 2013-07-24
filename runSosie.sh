#!/bin/sh

for i in `cat $1`
do
    mvn -Dtest=$i test
done
