package fr.inria.diversify.util;

import java.net.URL;
import java.net.URLClassLoader;


public class MyClassLoader extends URLClassLoader{

    /**
     * @param urls, to carryforward the existing classpath.
     */
    public MyClassLoader(URL[] urls) {
        super(urls);
    }

    @Override
    /**
     * add ckasspath to the loader.
     */
    public void addURL(URL url) {
        super.addURL(url);
    }

}
