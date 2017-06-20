# Sosiefier
Sosiefier is a project that aims at exporing the space of sosie of java programs.
It can be used to:
 * Explore java sources in order to build source transformations
 * Apply transformation and run tests in order to determine if the variant obtained is a sosie or not.
 * Chain these operations
Project > Transformation exploration > apply transformation > build & run tests > results

# Architecture

## Transformation
Describe a source transformation.
## Querry
Explore a program to find transofrmations.
(In order to test your query see `generator/src/test/java/fr/inria/diversify/transformation/query/LoopFlipQueryTest.java`)
## Runner
Behavior to execute whith a set of transformations.
## JSON input
Read a transformation from a json file

## Configuration Files
See examples in `./configurationFiles`

# Usage

```sh
java -jar main/target/main-1.0.0-jar-with-dependencies.jar path/to/config/file.properties
```
