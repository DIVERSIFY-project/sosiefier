package fr.inria.diversify.transformation.query;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.LoopFlip;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.InitUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import spoon.reflect.declaration.CtMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by nharrand on 20/01/17.
 */
public class LoopFlipQueryTest {

    InputProgram inputProgram;

    @Before
    public void setUp() {
        try {
            FileInputStream propertiesFile = new FileInputStream(new File("src/test/resources/jDummy/loopflip/loopflip.properties"));
            InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

            inputProgram = InitUtils.initInputProgram(inputConfiguration);

            InitUtils.initSpoon(inputProgram, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean containsString(Iterable<String> s, String v) {
        for(String str : s) {
            if(v.contains(str)) return true;
        }
        return false;
    }

    @Test
    public void query() throws Exception {
        LoopFlipQuery query = new LoopFlipQuery(inputProgram);
        Set<String> methods = new HashSet<>();
        methods.add("loopZero");
        methods.add("loopOne");
        methods.add("loopTwo");
        methods.add("loopThree");
        methods.add("loopFour");
        methods.add("loopFive");
        methods.add("loopSix");
        methods.add("loopSeven");
        methods.add("loopEight");
        methods.add("loopNine");

        for(int i = 0; i < 9; i++) {
            LoopFlip t = (LoopFlip) query.query();
            assertTrue(containsString(methods,t.methodLocationName()));
        }
    }

    @Test
    public void hasNextTransformation() throws Exception {
        TransformationQuery query = new LoopFlipQuery(inputProgram);

        for(int i = 0; i < 9; i++) {
            assertTrue(query.hasNextTransformation());
            query.query();
        }
        assertTrue(!query.hasNextTransformation());

    }

}