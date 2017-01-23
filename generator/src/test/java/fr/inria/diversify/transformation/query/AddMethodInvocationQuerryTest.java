package fr.inria.diversify.transformation.query;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.util.InitUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

import static org.junit.Assert.*;

/**
 * Created by nharrand on 23/01/17.
 */
public class AddMethodInvocationQuerryTest {

    InputProgram inputProgram;

    public void setUp(boolean isStatic, boolean isInternal) {
        try {
            FileInputStream propertiesFile = new FileInputStream(new File("src/test/resources/jDummy/addMI/addMI_"
                    + (isStatic ? "s" : "ns") + "_" + (isInternal ? "i" : "e") + ".properties"));
            InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

            inputProgram = InitUtils.initInputProgram(inputConfiguration);

            InitUtils.initSpoon(inputProgram, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean containsString(Iterable<String> s, String v) {
        for(String str : s) {
            if(str.compareTo(v) == 0) return true;
        }
        return false;
    }

    @Test
    public void query() throws Exception {
        setUp(true, true);
        AddMethodInvocationQuerry q = new AddMethodInvocationQuerry(inputProgram);

        while(q.hasNextTransformation()) {
            AddMethodInvocation t = (AddMethodInvocation) q.query();
            //assertTrue(t.isjStatic());
        }


        setUp(true, false);
        q = new AddMethodInvocationQuerry(inputProgram);

        while(q.hasNextTransformation()) {
            AddMethodInvocation t = (AddMethodInvocation) q.query();
            assertTrue(t.isjStatic());
        }

    }

    @Test
    public void hasNextTransformation() throws Exception {

    }

}