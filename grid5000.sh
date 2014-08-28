#!/bin/sh
cd /root
git clone https://github.com/marcelinorc/junco-provider.git
cd junco-provider
git pull
mvn clean install

cd /root/diversify-statements
git pull
mvn -Dmaven.test.skip=true clean package


rm -rf repo/sosie-exp

java -Djava.library.path=lib -jar target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar git repo

sh script/runFromGit.sh 1000 repo &
