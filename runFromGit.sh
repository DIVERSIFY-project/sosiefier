#!/bin/sh

java -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar git $2

for i in `seq 1 $1`
do
    java -Xmx2000m -XX:MaxPermSize=256m -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar $(cat propertiesFile) &
    java -Xmx2000m -XX:MaxPermSize=256m -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar $(cat propertiesFile)
done
