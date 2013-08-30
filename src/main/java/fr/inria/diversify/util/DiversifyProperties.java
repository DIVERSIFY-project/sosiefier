package fr.inria.diversify.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * User: Simon
 * Date: 7/17/13
 * Time: 11:01 AM
 */
public class DiversifyProperties {

    protected static Properties prop;

    public DiversifyProperties(String file) throws IOException {
        prop = new Properties();
        setDefaultProperties();
        prop.load(new FileInputStream(file));

    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    protected void setDefaultProperties() {
        prop.setProperty("src", "src/main/java");
        prop.setProperty("classes", "target/classes");
        prop.setProperty("clojure","false");
        prop.setProperty("javaVersion", "5");
        prop.setProperty("transformation.type","replace");
        prop.setProperty("transformation.size","1");
        prop.setProperty("stat", "false");
        prop.setProperty("sosie", "false");
        prop.setProperty("outputDir", "output_diversify");
    }

}
