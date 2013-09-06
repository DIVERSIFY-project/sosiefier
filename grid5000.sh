#!/bin/sh
git pull
mvn clean package
sh runFromGit.sh 100 repo