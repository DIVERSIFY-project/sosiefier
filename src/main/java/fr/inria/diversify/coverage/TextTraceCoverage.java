package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import javassist.CtMethod;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by marodrig on 20/07/2014.
 */
public class TextTraceCoverage extends TraceCoverage {

    /**
     * Create the text trace coverage. Assumes that in the coverage dir is the "id" file containing
     * the signatures of the methods. It also assumes (for simplicity) that the code is only instrumented
     * with methods
     * @param coverageDir
     */
    public TextTraceCoverage(File coverageDir) {
        super(coverageDir);
    }


    @Override
    public void create() throws IOException {
        //Read the ids from file
        BufferedReader reader = new BufferedReader(new FileReader(trace.getAbsolutePath() + "/id"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] k = line.split(" ");
            methodSignatures.add(k[1]);
        }
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {
        CtElement e = stmt.getCtCodeFragment();
        while ( e != null && !(e instanceof spoon.reflect.declaration.CtMethod) ) {
            e = e.getParent();
        }

        if ( e != null && e instanceof spoon.reflect.declaration.CtMethod) {
            String className = stmt.getCtCodeFragment().getParent(CtSimpleType.class).getQualifiedName();
            spoon.reflect.declaration.CtMethod m = (spoon.reflect.declaration.CtMethod)e;
            return methodSignatures.contains(className + "." + m.getSignature()) ? 1.0 : 0.0;
        }
        throw new RuntimeException("Unable to find parent method");
    }

}
