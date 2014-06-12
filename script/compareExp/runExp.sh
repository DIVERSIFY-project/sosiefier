#!/bin/sh

pwd=$(pwd)

#sosieDirectory=$pwd/easymock-sosie
sosieDirectory=$1
jarName=$2
#projectDirectory=$pwd/commons-collections
projectDirectory=$3
#scriptDirectory=
scriptDirectory=$5
#originalLog=$pwd/../instruAll/easymock/log
originalLog=$4


jarAndLogSosieDirectory=$pwd/jarAndLog
logDirectory=$pwd/log
resultDirectory=$pwd/result


#sh $scriptDirectory/buildAlljar.sh $sosieDirectory $jarAndLogSosieDirectory $jarName
cd $sosieDirectory
for sosie in $(ls)
do
    sh $scriptDirectory/buildJar.sh $sosie "1" $jarAndLogSosieDirectory $jarName
    sh $scriptDirectory/buildJar.sh $sosie "2" $jarAndLogSosieDirectory $jarName
done

sh $scriptDirectory/same.sh $jarAndLogSosieDirectory $projectDirectory/excludeDiff $originalLog $scriptDirectory

#sh $scriptDirectory/runAll.sh $jarAndLogSosieDirectory $projectDirectory $logDirectory $jarName
cd $jarAndLogSosieDirectory
pwd2=$(pwd)

for jar in $(ls)
do
    sh $scriptDirectory/run.sh $jar $projectDirectory $pwd2/$jar $logDirectory $jarName
done

sh $scriptDirectory/diff.sh $logDirectory $projectDirectory  $pwd/jarAndLog $resultDirectory $scriptDirectory