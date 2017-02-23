package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtNamedElement;
import spoon.reflect.declaration.CtType;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by marodrig on 20/07/2014.
 */
public class TextTraceCoverageReport extends TraceCoverageReport {

    /**
     * Create the text trace coverage. Assumes that in the coverage dir is the "id" file containing
     * the signatures of the methods. It also assumes (for simplicity) that the code is only instrumented
     * with methods
     * @param coverageDir
     */
    public TextTraceCoverageReport(File coverageDir) {
        super(coverageDir);
    }

    public TextTraceCoverageReport(String trace) throws IOException {
        super(trace);
    }


    @Override
    public void create() throws IOException {
        //Read the ids from file
        BufferedReader idreader = new BufferedReader(new FileReader(trace.getAbsolutePath() + "/id"));
        String idline;
        //The ID file contains all signatures instrumented
        HashMap<Integer, String> idSignatures = new HashMap<>();
        while ((idline = idreader.readLine()) != null) {
            String[] k = idline.split(" ");
            idSignatures.put(Integer.parseInt(k[0]), k[1] + " " + k[2]);
        }

        //Read the method id's from the trace
        Pattern methodPattern = Pattern.compile("M(\\d+);(\\d+)\\$\\$\\$");
        File[] files = trace.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().startsWith("log")) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    Matcher m = methodPattern.matcher(line);
                    if ( m.matches() ) {
                        int id = Integer.parseInt(m.group(2));
                        String signature = idSignatures.get(id);
                        if ( !methodSignatures.contains(signature) ) {
                            methodSignatures.add(idSignatures.get(id));
                        }
                    }
                }
            }
        }
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {

        CtElement e = stmt.getCtCodeFragment();

        boolean foundMethod = false;
        while ( e != null && !foundMethod ) {
            e = e.getParent();
            foundMethod = e != null && (e instanceof spoon.reflect.declaration.CtMethod || e instanceof  CtConstructor);
        }

        if (foundMethod ) {
            String className = stmt.getCtCodeFragment().getParent(CtType.class).getQualifiedName();
            return methodSignatures.contains(className + "." + ((CtNamedElement)e).getSimpleName()) ? 1.0 : 0.0;
        }
        return 0.0;
        //throw new RuntimeException("Unable to find parent method");

    }

    @Override
    public double positionCoverage(SourcePosition position) {
        return 0;
    }

}
