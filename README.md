# Sosiefier
Sosiefier is a project that aims at exploring the space of sosie of java programs. (Sosie means here a program variant that passes the original test suit.)
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

## Exemple

See [Exemple_README.md](Exemple_README.md)
