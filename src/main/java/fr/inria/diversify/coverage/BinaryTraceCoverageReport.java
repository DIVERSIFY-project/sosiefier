package fr.inria.diversify.coverage;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.sosie.logger.BinaryLogReader;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;

import java.io.File;
import java.io.IOException;

/**
 * Created by marodrig on 17/07/2014.
 */
public class BinaryTraceCoverageReport extends TraceCoverageReport {

    public BinaryTraceCoverageReport(File coverageDir) {
        super(coverageDir);
    }

    public BinaryTraceCoverageReport(String trace) throws IOException {
        super(trace);
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
        CtElement e = stmt.getCtCodeFragment();
        while ( e != null && !(e instanceof spoon.reflect.declaration.CtMethod) ) {
            e = e.getParent();
        }

        if ( e != null && e instanceof spoon.reflect.declaration.CtMethod) {
            String className = stmt.getCtCodeFragment().getParent(CtSimpleType.class).getQualifiedName();
            spoon.reflect.declaration.CtMethod m = (spoon.reflect.declaration.CtMethod)e;
            String[] signatureParts = m.getSignature().split(" ");
            String k = signatureParts[0] + " " + className + "." + signatureParts[1];
            return methodSignatures.contains(k) ? 1.0 : 0.0;
        }
        throw new RuntimeException("Unable to find parent method");
    }
}
