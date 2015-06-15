package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

@Deprecated
public class TestCountInstrumenter extends TestProcessor {
    protected int staticCount = 0;

    @Override
    public void process(CtMethod element) {
        staticCount++;
        Log.debug("intru test: {}, {}",element.getSimpleName(), staticCount);
        CtBlock body = element.getBody();

        String snippet = getLogName() + ".testCount(\"" + element.getSignature() + "\")";

        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);

        body.insertBegin(snippetStatement);


    }
}
