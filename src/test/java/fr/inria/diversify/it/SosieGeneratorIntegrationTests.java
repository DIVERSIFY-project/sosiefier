package fr.inria.diversify.it;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

/**
 * A parent class to all integration tests
 * <p>
 * Created by marodrig on 06/01/2015.
 */
public class SosieGeneratorIntegrationTests {

    private Properties properties;

    /**
     * Get the path of a file located in the resource directory
     *
     * @param name
     * @return
     */
    private String getResourcePath(String name) {
        String resourceRoot = null;
        try {
            resourceRoot = getClass().getResource("/").toURI().getPath();
            return getClass().getResource("/" + name).toURI().getPath();
        } catch (URISyntaxException e) {
            Log.error("Unable to find file " + resourceRoot + name);
            throw new RuntimeException("Unable to find file " + resourceRoot + name);
        }
    }

    /**
     * Obtain the directory where the data for integration test is located
     *
     * @return as string  with the full path of the directory
     */
    protected String getDataDir() {
        String path = getProperties().getProperty("data.path");
        if (path == null) {
            Log.error("Unable to find the 'data.path' property");
            throw new RuntimeException("Unable to find the 'data.path' property");
        }
        return path;
    }

    /**
     * Obtains a collection of input configuration from the data directory
     *
     * @return A InputConfiguration collection
     */
    protected Collection<InputConfiguration> getConfigurations() {

        ArrayList<InputConfiguration> results = new ArrayList<>();

        File file = new File(
                getProperties().getProperty("data.dir") +
                        getProperties().getProperty("input.configurations", "/input_configurations"));

        for (File f : file.listFiles()) {
            if (f.getName().endsWith(".properties")) {
                try {
                    results.add(new InputConfiguration(f.getAbsolutePath()));
                } catch (IOException e) {
                    Log.error("Unable to load configuration file at " + f.getAbsolutePath());
                    throw new RuntimeException(e);
                }
            }
        }
        return results;
    }


    /**
     * Load the properties from the property files and return its contents.
     *
     * @return A Properties instance
     */
    protected Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(new FileInputStream(getResourcePath("integration_test.properties")));
            } catch (IOException e) {
                Log.error("Unable to read 'integration_test.properties'");
                throw new RuntimeException(e);
            }
        }
        return properties;
    }

}
