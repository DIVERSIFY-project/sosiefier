#!/bin/sh
cd /root
git clone https://github.com/marcelinorc/junco-provider.git
cd junco-provider
git pull
mvn clean install

cd /root/diversify-statements
git pull
mvn clean -Dmaven.test.skip=true package

rm -rf repo

java -Djava.library.path=lib -Dhttp.proxyHost=proxy.rennes.grid5000.fr -Dhttps.proxyPort=3128 -Dhttps.proxyHost=proxy.rennes.grid5000.fr -Dhttp.proxyPort=3128 -jar target/Sosies-generator-1.0-SNAPSHOT-jar-with-dependencies.jar git repo

sh script/runFromGit.sh 1000 repo &

sh grid5000.sh
