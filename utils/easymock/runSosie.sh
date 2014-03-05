#!/bin/sh

#generation des sosies
#java -Xmx2000m -XX:MaxPermSize=256m -jar target/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar $1



#run des sosies
#$1: chemin absolul
cd $1

mkdir log
cd instru
for sosie in $(ls)
do
    cd $sosie/mutant
    mvn test
    cd ../mutantSosie
    mvn test
    cd ../..
    mkdir ../log/$sosie
    mkdir ../log/$sosie/mutant
    mkdir ../log/$sosie/mutantSosie
    cp $sosie/mutant/diversificationPoint ../log/$sosie
    cp -r $sosie/mutant/easymock/log/* ../log/$sosie/mutant
    cp -r $sosie/mutantSosie/easymock/log/* ../log/$sosie/mutantSosie

    rm ../compare.properties
    cp $2 ../compare.properties

   echo project=$3 >> ../compare.properties
    echo result=$4 >> ../compare.properties
    echo varToExclude=$5 >> ../compare.properties
     echo type=assert >> ../compare.properties
    echo dirOriginal=../log/$sosie/mutant >> ../compare.properties
    echo dirSosie=../log/$sosie/mutantSosie >> ../compare.properties

echo "run assert compare"
cat ../compare.properties
   java -Xmx2000m -XX:MaxPermSize=256m -cp $7/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.compare.refactor.CompareLogMain ../compare.properties

   rm ../compare.properties
    cp $2 ../compare.properties
     echo project=$3 >> ../compare.properties
    echo result=$4 >> ../compare.properties
    echo varToExclude=$6 >> ../compare.properties
     echo type=exception >> ../compare.properties
    echo dirOriginal=../log/$sosie/mutant >> ../compare.properties
    echo dirSosie=../log/$sosie/mutantSosie >> ../compare.properties

echo "run exception compare"
cat ../compare.properties
   java -Xmx2000m -XX:MaxPermSize=256m -cp $7/Diversify-statements-1.0-SNAPSHOT-jar-with-dependencies.jar fr.inria.diversify.sosie.compare.refactor.CompareLogMain ../compare.properties

done



