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
        setCodeFragmentClass();
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    protected void setCodeFragmentClass() {
        if(prop.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.StatementProcessor"))
            prop.setProperty("CodeFragmentClass", "fr.inria.diversify.codeFragment.Statement");
        if(prop.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.ExpressionProcessor"))
            prop.setProperty("CodeFragmentClass", "fr.inria.diversify.codeFragment.Expression");
        if(prop.getProperty("processor").equals("fr.inria.diversify.codeFragmentProcessor.BlockProcessor"))
            prop.setProperty("CodeFragmentClass", "fr.inria.diversify.codeFragment.Block");
    }

    protected void setDefaultProperties() {
        prop.setProperty("src", "src/main/java");
        prop.setProperty("testSrc", "src/test/java");
        prop.setProperty("classes", "target/classes");
        prop.setProperty("clojure","false");
        prop.setProperty("javaVersion", "5");
        prop.setProperty("transformation.type","replace");
        prop.setProperty("transformation.size","1");
        prop.setProperty("stat", "false");
        prop.setProperty("sosie", "false");
        prop.setProperty("outputDir", "output_diversify");
        prop.setProperty("sosieOnMultiProject","false");
        prop.setProperty("timeOut","-1");
        prop.setProperty("logLevel", "2");
        prop.setProperty("gitRepository", "");
        prop.setProperty("processor", "fr.inria.diversify.codeFragmentProcessor.StatementProcessor");
        prop.setProperty("syncroRange","0");
        prop.setProperty("newPomFile","");
        prop.setProperty("transformation.level","statement");
        prop.setProperty("builder","maven");
    }
}
