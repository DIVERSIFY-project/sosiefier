#!/bin/sh
# $1 sosie directory
# $2 id
# $3 output directory
# $4 jar name

cd $1

mv log/id id
rm  -r log/
mkdir log/
mv id log/id

mvn clean package

mkdir -p $3/$1
cp target/$4 $3/$1/$4

mkdir -p $3/$1/log/$2

cp log/* $3/$1/log/$2

cd $3/$1/log/$2

rm -r logThread-*
rm -r logTime-*
rm -r logpool-*
rm -r logFinalizer*