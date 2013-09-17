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
    cp -r ../../utils/logger/ ../sosieInstru/$sosie/jbehave-core/src/main/java/
done

#run des sosies
mkdir ../log
cd ../sosieInstru
LogDirName=$(date +%s)
for sosie in $(ls)
do
    cd $sosie
    echo $LogDirName > LogDirName
    for i in `cat $2`
    do
        echo $i > LogfileName
        mvn -Dtest=$i test
    done
cp diversificationPoint ../log/$LogDirName/
cp -r jbehave-core/$LogDirName/ ../log/$LogDirName/
done
#comparaison des traces original/sosie
#    java -Xmx2000m -XX:MaxPermSize=256m target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie $1 $
#done


