#!/bin/sh

echo $(date +%s) > LogDirName
for i in `cat $1`
do
    echo $i > LogfileName
    mvn -Dtest=$i test
done
