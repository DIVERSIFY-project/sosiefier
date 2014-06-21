package fr.inria.diversify.util;

import fr.inria.diversify.diversification.InputConfiguration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Note: This class should be deprecated since it difficult testing
 *
 * User: Simon
 * Date: 7/17/13
 * Time: 11:01 AM
 */
public class DiversifyProperties {


    protected static InputConfiguration configuration;

    public DiversifyProperties(String file) throws IOException {
        configuration = new InputConfiguration(file);

    }

    public DiversifyProperties(InputConfiguration configuration) throws IOException {
        this.configuration = configuration;
    }

    public static String getProperty(String key) {
        return configuration.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return configuration.getProperty(key, defaultValue);
    }
}
