#!/bin/sh

#generation des sosies
java -Xmx2000m -XX:MaxPermSize=256m -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar $1

cd output_sosie/sosie
#instru des sosies
for sosie in $(ls)
do
    echo $sosie
    mkdir ../sosieInstru
    cp -r $sosie ../sosieInstru
    java -Xmx2000m -XX:MaxPermSize=256m -cp .:../../target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.MainInstru $sosie/jbehave-core/src/main/java/ ../sosieInstru/$sosie/jbehave-core/src/main/java
    cp -r ../../utils/logger/fr ../sosieInstru/$sosie/jbehave-core/src/main/java/
done

#run des sosies
cd ..
mkdir log
cd sosieInstru
for sosie in $(ls)
do
    echo sosie
    echo $sosie
    cd $sosie
    LogDirName=$(date +%s)
    echo logDirName
        echo $LogDirName
    echo $LogDirName > jbehave-core/LogDirName
    echo $LodDirName > LogDirName
    for i in `cat $2`
    do
        echo $i > jbehave-core/LogfileName
        mvn -Dtest=$i test
    done
    cd ..
    mkdir ../log/log$LogDirName
    cp $sosie/diversificationPoint ../log/log$LogDirName/
    cp -r $sosie/jbehave-core/log$LogDirName/ ../log/log$LogDirName/
done


