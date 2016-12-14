package fr.inria.diversify.util;

import fr.inria.diversify.runner.InputProgram;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;

import java.util.List;

/**
 * Created by nharrand on 09/12/16.
 */
public class MethodCallTracer {

    public static void addTraces(InputProgram program) {
        List<CtExecutable> allExecutable = program.getAllElement(CtExecutable.class);
        int id = 0;
        for(CtExecutable exe: allExecutable) {
            //exe.getBody().insertBegin();
            //Find returns
            //exe.getBody()
        }
    }
}
