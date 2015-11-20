package fr.inria.diversify.buildSystem;

import fr.inria.diversify.runner.InputProgram;

import java.net.URL;
import java.util.List;

/**
 * User: Simon
 * Date: 14/10/15
 * Time: 10:56
 */
public interface DependencyResolver {

    void resolveDependencies(InputProgram inputProgram) throws Exception;
    List<URL> getDependencies();

}
