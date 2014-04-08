#!/bin/sh
sleep 20
cd /root/diversify-statements
git pull
mvn clean package

rm -rf repo/sosie-exp
mkdir repo
sh script/git/init.sh repo

java -jar target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar git repo

sh runFromGit.sh 100 repo &
