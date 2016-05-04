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

java -Djava.library.path=lib -Dhttp.proxyHost=proxy.rennes.grid5000.fr -Dhttps.proxyPort=3128 -Dhttps.proxyHost=proxy.rennes.grid5000.fr -Dhttp.proxyPort=3128 -jar main/target/main-1.0.0-jar-with-dependencies.jar git repo


cpu=$(cat nbProcess)
for i in `seq 1 100000`
do
# for j in `seq 1 $cpu`
#    do
java -Djava.library.path=lib -Xmx8000m  -Dhttp.proxyHost=proxy.rennes.grid5000.fr  -Dhttps.proxyPort=3128 -Dhttps.proxyHost=proxy.rennes.grid5000.fr  -Dhttp.proxyPort=3128  -jar main/target/main-1.0.0-jar-with-dependencies.jar $(cat propertiesFile)  # >  out_$i_$j &
#    done
#    wait
    killall java
done
