#!/bin/sh
cd /root/diversify-statements
git pull
mvn clean package
java -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar git $2

sh runFromGit.sh 100 repo &
