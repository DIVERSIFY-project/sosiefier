#!/bin/sh
cd /root/diversify-statements
git pull
mvn clean package

n=$RANDOM
sleep $(( r %= 300 ))

rm -rf repo/diversify-exp
java -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar git repo

sh runFromGit.sh 100 &
