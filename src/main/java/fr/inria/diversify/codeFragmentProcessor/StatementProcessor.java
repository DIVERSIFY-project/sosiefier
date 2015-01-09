package fr.inria.diversify.codeFragmentProcessor;

import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtStatement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatementProcessor extends AbstractCodeFragmentProcessor<CtStatement> {
	protected ValidStatementVisitor valid;
    protected List<File> sourceFilter;


    public StatementProcessor(String externalSourceCodeDir) {
         sourceFilter = Arrays.asList(externalSourceCodeDir.split(System.getProperty("path.separator")))
                              .stream()
                              .map(s -> new File(s))
                              .collect(Collectors.toList());
    }

    public void process(CtStatement element) {
		try {
			if(isValidStatement(element)) {

                Statement stmt = new Statement(element);
				addCf(stmt);
			}
		} catch (Exception e) {
            try{
                Log.debug("error in StatementProcessor.process with the statement: "+element, e);
            } catch (Exception ee) {
                Log.debug("error in StatementProcessor.process with the statement ");
            }
		}
	}


	protected boolean isValidStatement(CtStatement element) throws IOException {
        return true;
        /*
        String file = element.getPosition().getCompilationUnit().getFile().toString();
        for (File filter : sourceFilter) {
            if(file.contains(filter.getCanonicalPath().toString()))
                return false;
        }

		 valid = new ValidStatementVisitor(element, false);
		element.getParent().accept(valid);
		return !valid.inExpression(element) && valid.isValid();*/
	}

}

