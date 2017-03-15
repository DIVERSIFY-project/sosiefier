package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.util.InitUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

import static org.junit.Assert.*;

/**
 * Created by nharrand on 01/02/17.
 */
public class SwapSubTypeQueryTest {
    InputProgram inputProgram;

    @Before
    public void setUp() {
        try {
            FileInputStream propertiesFile = new FileInputStream(new File("src/test/resources/jDummy/swapSubType/swapSubType.properties"));
            InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

            inputProgram = InitUtils.initInputProgram(inputConfiguration);

            InitUtils.initSpoon(inputProgram, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void query() throws Exception {
        SwapSubTypeQuery q = new SwapSubTypeQuery(inputProgram);
        q.query();
    }

    @Test
    public void hasNextTransformation() throws Exception {

    }

}