package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtStatement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatementProcessor extends AbstractCodeFragmentProcessor<CtStatement> {
//    protected ValidStatementVisitor valid;
    protected List<File> sourceFilter = null;


    public StatementProcessor(String externalSourceCodeDir) {
        if (!externalSourceCodeDir.equals("")) {
            sourceFilter = new ArrayList<>();
            for ( String s :  externalSourceCodeDir.split(System.getProperty("path.separator")) )
                sourceFilter.add(new File(s));
        }
    }

    public void process(CtStatement element) {
        try {
            if (isValidStatement(element)) {
                Statement stmt = new Statement(element);
                addCf(stmt);
            }
        } catch (Exception e) {
            try {
                Log.warn("error in StatementProcessor.process with the statement: " + element, e);
            } catch (Exception ee) {
                Log.warn("error in StatementProcessor.process with the statement ");
            }
        }
    }


    protected boolean isValidStatement(CtStatement element) throws IOException {
        if (sourceFilter != null) {
            String file = element.getPosition().getCompilationUnit().getFile().toString();
            for (File filter : sourceFilter) {
                if (file.contains(filter.getCanonicalPath().toString())) return false;
            }
        }
        if(element.getParent() instanceof CtBlock) {
            String elementString = element.toString();
            return !(elementString.startsWith("super") || elementString.startsWith("this("));
        }
        return false;

//        valid = new ValidStatementVisitor(element, false);
//        element.getParent().accept(valid);
//        return !valid.inExpression(element) && valid.isValid();
    }

}

