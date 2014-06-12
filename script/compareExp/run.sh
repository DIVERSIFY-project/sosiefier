#!/bin/sh
#$1 project name
#$2 project directory (full path)
#$3 sosie jar directory (full path)
#$4 directory for output log (full path)
#$5 jar name

cd $2

mv log/id id
rm  -r log/
mkdir log/
mv id log/id
cp $3/$5 $2/$5

mvn clean test

mkdir -p $4/$1
cp log/*  $4/$1
cd $4/$1

rm -r logThread-*
rm -r logTime-*
rm -r logpool-*