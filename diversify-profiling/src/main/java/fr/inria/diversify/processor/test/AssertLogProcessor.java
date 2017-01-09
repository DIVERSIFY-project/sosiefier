package fr.inria.diversify.processor.test;

import fr.inria.diversify.processor.ProcessorUtil;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

public class AssertLogProcessor extends TestProcessor {

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        return isTest(candidate)
                && !cloneTests.contains(candidate);
//                && !testWhitThread(candidate);
    }


    @Override
    public void process(CtMethod element) {
        int methodId = ProcessorUtil.methodId(element);

        Query.getElements(element, new TypeFilter<CtInvocation>(CtInvocation.class))
                .stream()
                .filter(call -> isAssert(call))
                .forEach(call -> {
                    try {
                        int id = ProcessorUtil.idFor(call.toString());

                        String snippetBefore = getLogName() + ".beforeAssert(Thread.currentThread()," + methodId + "," + id + ")";
                        call.insertBefore(getFactory().Code().createCodeSnippetStatement(snippetBefore));

                        String snippetAfter = getLogName() + ".afterAssert(Thread.currentThread()," + methodId + "," + id + ")";
                        call.insertAfter(getFactory().Code().createCodeSnippetStatement(snippetAfter));

                } catch (Exception e) {}
                });
    }

    protected boolean isAssert(CtInvocation invocation) {
        try {
            Class cl = invocation.getExecutable().getDeclaringType().getActualClass();

            return isAssertInstance(cl);
        } catch (Exception e) {
            return false;
        }

    }

    protected boolean isAssertInstance(Class cl) {
        if (cl.equals(org.junit.Assert.class) || cl.equals(junit.framework.Assert.class))
            return true;
        Class superCl = cl.getSuperclass();
        if(superCl != null) {
            return isAssertInstance(superCl);
        }
        return false;
    }
}