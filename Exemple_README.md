# Usage

## Exploration phase
First choose a transformation to explore and a project.

The following steps will allow to describe the transformation space

Then write a property file:
```
project=../commons-codec

jacoco=configurationFiles/commons-codec/jacoco.xml
#jacoco=configurationFiles/commons-codec/jacoco.exec
javaVersion=6
nbRun=-1
timeOut=-1
runner=smart
transformation.type=addmi
transformation.subtype=false
#gitRepository=repo
#copy.sosie.sources.to=sosie_src
printCandidates=true
test-impact=../commons-codec/tie-report.json

transformationsOutput=transformationsToExplore/nonstatic_external/commons-codec/

addmi.internalMethods=false
addmi.externalMethods=true
addmi.staticMethods=false
addmi.nonstaticMethods=true
addmi.dumpMethodsAfterSuccess=false
addmi.shuffleCandidate=false
addmi.shuffleMethods=false
addmi.maxMethodTryPerStmt=100

maxTransformationPerFile=20
```

Run it
```sh
java -jar main/target/main-1.0.0-jar-with-dependencies.jar path/to/config/file.properties
```

You should have in the result directory a series of json file listing possible transformation.

## Test phase

The following step will test each transformation of the exploration space

```
#PATH TO TARGET PROJECT
project=../commons-codec

#PATH TO RESULT DIRECTORY
result=smartRunnerResult/commons-codec/codec

#JACOCO TEST COVERAGE REPORT (transformation must affect a place covered by tests)
jacoco=configurationFiles/commons-codec/jacoco.exec

javaVersion=6

#RUN ALL TRANSFORMATIONS
nbRun=-1

#NO TIMEOUT
timeOut=-1

#TRANSFORMATION TYPE (fromlist is not really a transformation, it loads transformation from json files)
transformation.type=fromlist
transformation.directory=transformationsToExplore/nonstatic_external/commons-codec

#RUNNER SELECTION (smart runner only run test that cover the transformed methods and check that execution trace diverge from original. This runner requires the following properties)#
runner=smart

#Original traces generated with yajta ( https://github.com/diverse-project/yajta )
traces=/home/nharrand/Documents/sosie/commons-codec/traces

#Agent that assess that traces diverge
traceAgent=/home/nharrand/Documents/yajta/target/yajta-2.0.0-jar-with-dependencies.jar

#Pacjage to trace
tracePackage=org.apache.commons.codec

#Test to run for each method (generated with yajta)
test-impact=/home/nharrand/Documents/sosie/commons-codec/tie-report.json
```
