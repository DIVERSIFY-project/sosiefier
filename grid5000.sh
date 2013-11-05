#!/bin/sh
cd /root/diversify-statements
git pull
mvn clean package
java -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar git repo

sh runFromGit.sh 100 &
