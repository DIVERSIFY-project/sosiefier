package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

public class AssertCountInstrumenter extends TestProcessor {
    protected int staticCount = 0;

    @Override
    public void process(CtMethod element) {

        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        String snippet =  getLogName() + ".assertCount(\"" + element.getSignature() + "\")";
        snippetStatement.setValue(snippet);

        Query.getElements(element, new TypeFilter<CtInvocation>(CtInvocation.class))
                .stream()
                .filter(call -> isAssert(call))
                .forEach(call -> {
                    call.insertBefore(snippetStatement);
                    staticCount++;
                });

        Log.debug("intru assert in test: {}, {}", element.getSignature(), staticCount);

    }

    protected boolean isAssert(CtInvocation invocation) {
            try {
                Class cl = invocation.getExecutable().getDeclaringType().getActualClass();
                return org.junit.Assert.class.isAssignableFrom(cl);
            }catch (Exception e) {
                return false;
            }

    }
}