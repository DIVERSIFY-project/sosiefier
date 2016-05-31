#!/bin/sh


java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/breakDelete-codec.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/breakDelete-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/breakDelete-gson.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/breakDelete-io.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/breakDelete-lang.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/checkReturnIf-codec.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/checkReturnIf-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/checkReturnIf-gson.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/checkReturnIf-io.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/checkReturnIf-lang.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/continueDelete-codec.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/continueDelete-collections.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/continueDelete-gson.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/continueDelete-io.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/continueDelete-lang.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/emoveParamterCondition-codec.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar rconfigurationFiles/special/emoveParamterCondition-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removeParamterCondition-gson.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removeParamterCondition-io.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removeParamterCondition-lang.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removePut-codec.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removePut-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removePut-gson.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removePut-io.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar configurationFiles/special/removePut-lang.properties