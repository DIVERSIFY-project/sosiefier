package fr.inria.diversify.util;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import org.junit.Test;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.support.reflect.code.CtIfImpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nharrand on 27/01/17.
 */
public class VarFinderTest {

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

    public void testGetAccessibleVarsMethod(CtMethod m) {
        if((m.getSimpleName().compareTo("main") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("App") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement(), true).size() == 5);
        } else if((m.getSimpleName().compareTo("loops") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("App") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement(), true).size() == 4);
        } else if((m.getSimpleName().compareTo("branch") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("App") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement(), true).size() == 3);
            CtIfImpl i0 = (CtIfImpl) m.getBody().getStatement(1);
            CtIfImpl i1 = (CtIfImpl) ((CtBlock<Object>)i0.getThenStatement()).getStatement(2);
            CtStatement s = ((CtBlock<Object>)i1.getElseStatement()).getStatement(2);
            assertTrue(VarFinder.getAccessibleVars(s, true).size() == 6);
        } else if((m.getSimpleName().compareTo("conditions") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("App") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement(), true).size() == 3);
        } else if((m.getSimpleName().compareTo("printHello") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement(), true).size() == 0);
        } else if((m.getSimpleName().compareTo("clone") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement(), true).size() == 2);
        } else if((m.getSimpleName().compareTo("getI") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement()).size() == 8);
        } else if((m.getSimpleName().compareTo("addI") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement()).size() == 9);
        } else if((m.getSimpleName().compareTo("print") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement()).size() == 8);
        } else if((m.getSimpleName().compareTo("addA") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement()).size() == 9);
        } else if((m.getSimpleName().compareTo("addB") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
            assertTrue(VarFinder.getAccessibleVars(m.getBody().getLastStatement()).size() == 9);
        }
    }

    @Test
    public void getAccessibleVars() throws Exception {
        setUp(true, true);
        List<CtMethod> methods = inputProgram.getAllElement(CtMethod.class);
        for(CtMethod m : methods) {
            testGetAccessibleVarsMethod(m);
        }
    }

    @Test
    public void getAccessibleClasses() throws Exception {

    }

    @Test
    public void getAccessibleMethods() throws Exception {
        setUp(true, true);
        List<CtMethod> methods = inputProgram.getAllElement(CtMethod.class);
        for(CtMethod m : methods) {
            if((m.getSimpleName().compareTo("main") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("App") == 0)) {
                assertTrue(VarFinder.getAccessibleMethods(m.getBody().getLastStatement(), true, false).size() == 5);
                assertTrue(VarFinder.getAccessibleMethods(m.getBody().getLastStatement(), false, true).size() == 7);
                assertTrue(VarFinder.getAccessibleMethods(m.getBody().getLastStatement(), true, true).size() == 12);
            }
        }
    }

    @Test
    public void getInternalMethods() throws Exception {
        setUp(true, true);
        List<CtMethod> methods = inputProgram.getAllElement(CtMethod.class);
        for(CtMethod m : methods) {
            if((m.getSimpleName().compareTo("main") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("App") == 0)) {
                assertTrue(VarFinder.getInternalMethods(m.getBody().getLastStatement(), true, false).size() == 4);
                assertTrue(VarFinder.getInternalMethods(m.getBody().getLastStatement(), false, true).size() == 0);
                assertTrue(VarFinder.getInternalMethods(m.getBody().getLastStatement(), true, true).size() == 4);
            } else if((m.getSimpleName().compareTo("addA") == 0) && (m.getParent(CtClass.class).getSimpleName().compareTo("A") == 0)) {
                assertTrue(VarFinder.getInternalMethods(m.getBody().getLastStatement(), true, false).size() == 2);
                assertTrue(VarFinder.getInternalMethods(m.getBody().getLastStatement(), false, true).size() == 5);
                assertTrue(VarFinder.getInternalMethods(m.getBody().getLastStatement(), true, true).size() == 7);
            }
        }
    }

}