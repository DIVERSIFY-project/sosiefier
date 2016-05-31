#!/bin/sh


java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar breakDelete-codec.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar breakDelete-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar breakDelete-gson.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar breakDelete-io.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar breakDelete-lang.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar checkReturnIf-codec.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar checkReturnIf-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar checkReturnIf-gson.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar checkReturnIf-io.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar checkReturnIf-lang.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar continueDelete-codec.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar continueDelete-collections.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar continueDelete-gson.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar continueDelete-io.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar continueDelete-lang.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removeParamterCondition-codec.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removeParamterCondition-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removeParamterCondition-gson.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removeParamterCondition-io.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removeParamterCondition-lang.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removePut-codec.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removePut-collections.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removePut-gson.properties &
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removePut-io.properties
wait
killall java
java -Djava.library.path=lib -Xmx8000m -jar main/target/main-1.0.0-jar-with-dependencies.jar removePut-lang.properties