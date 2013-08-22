package fr.inria.diversify.util;

import fr.inria.diversify.util.maven.DependencyTree;
import fr.inria.diversify.util.maven.DependencyTreeVisitor;
import org.eclipse.aether.graph.DependencyNode;

import java.net.URLClassLoader;

/**
 * User: Simon
 * Date: 7/31/13
 * Time: 2:14 PM
 */
public class ProjectDependency {
    MyClassLoader loader;

    public ProjectDependency(String ai, String fileName) throws Exception {
        URLClassLoader currentLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        loader = new MyClassLoader(currentLoader.getURLs());
        Thread.currentThread().setContextClassLoader(loader);

        DependencyTree dt = new DependencyTree();
        DependencyNode tree = dt.getDependencyTree(ai, fileName);
        tree.accept(new DependencyTreeVisitor(loader));

    }


}
