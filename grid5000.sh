#!/bin/sh
cd /root/diversify-statements
git pull
mvn clean package
sh runFromGit.sh 100 repo