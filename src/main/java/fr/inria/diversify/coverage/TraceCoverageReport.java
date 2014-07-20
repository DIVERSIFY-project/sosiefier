package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.compare.BinaryLogReader;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marodrig on 17/07/2014.
 */
public class TraceCoverageReport implements ICoverageReport {

    List<String> methodSignatures;

    File trace;

    public TraceCoverageReport(File trace) throws IOException {
        methodSignatures = new ArrayList<>();
        this.trace = trace;

    }

    public TraceCoverageReport(String trace) throws IOException {
        this(new File(trace));
    }

    @Override
    public void create() throws IOException {
        BinaryLogReader r = new BinaryLogReader(trace);
        while (!r.eof()) {
            BinaryLogReader.LogChunk c = r.next();
            if ( c != null && c instanceof BinaryLogReader.MethodCallChunk ) {
                methodSignatures.add(((BinaryLogReader.MethodCallChunk) c).getSignature());
            }
        }
    }

    @Override
    public double codeFragmentCoverage(CodeFragment stmt) {

        CtElement e = stmt.getCtCodeFragment().getParent();
        while ( e != null && !(e instanceof CtMethod) ) {
            e = e.getParent();
        }

        String className = stmt.getCtCodeFragment().getParent(CtSimpleType.class).getQualifiedName();

        if ( e != null && e instanceof CtMethod) {
            CtMethod m = (CtMethod)e;
            for ( String s : methodSignatures) {
                String[] signatureParts = m.getSignature().split(" ");
                String k = signatureParts[0] + " " + className + "." + signatureParts[1];
                if (s.equals(k)) {
                    return 1.0;
                }
            }
            return 0.0;
        }
        throw new RuntimeException("Unable to find parent method");
    }

    @Override
    public int opCodeCoverage(javassist.CtMethod method, int indexOpcode) {
        return 0;
    }

    @Override
    public double elementCoverage(CtElement operator) {
        return 0;
    }

    @Override
    public List<Integer> getCoverageDistribution(CodeFragment stmt) {
        return null;
    }
}
