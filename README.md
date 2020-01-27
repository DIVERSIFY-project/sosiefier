# Sosiefier
Sosiefier is a project that aims at exploring the space of sosie of java programs. (Sosie means here a program variant that passes the original test suit.)
It can be used to:
 * Explore java sources in order to build source transformations
 * Apply transformation and run tests in order to determine if the variant obtained is a sosie or not.
 * Chain these operations
Project > Transformation exploration > apply transformation > build & run tests > results

Reference:  "[A Journey Among Java Neutral Program Variants](http://arxiv.org/pdf/1901.02533)", In Journal Genetic Programming and Evolvable Machines, Springer, 2019. 

```
@article{arXiv-1901.02533,
 title = {A Journey Among Java Neutral Program Variants},
 journal = {Journal Genetic Programming and Evolvable Machines, Springer},
 year = {2019},
 doi = {10.1007/s10710-019-09355-3},
 author = {Nicolas Harrand and Simon Allier and Marcelino Rodriguez-Cancio and Martin Monperrus and Benoit Baudry},
 url = {http://arxiv.org/pdf/1901.02533},
}
```


## Architecture

* Transformation: Describe a source transformation.
* Query: Explore a program to find transofrmations. (In order to test your query see `generator/src/test/java/fr/inria/diversify/transformation/query/LoopFlipQueryTest.java`)
* Runner: Behavior to execute whith a set of transformations.
* JSON input: Read a transformation from a json file

## Configuration Files
See examples in `./configurationFiles`

See also [Exemple_README.md](Exemple_README.md)
