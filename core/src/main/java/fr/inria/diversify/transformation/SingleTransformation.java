package fr.inria.diversify.transformation;

import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 11:16
 */
public abstract class SingleTransformation extends Transformation {


    public abstract String classLocationName();

    public abstract String packageLocationName();

    public abstract String methodLocationName();

    public abstract SourcePosition getPosition();

    public abstract int line();


    public List<SourcePosition> getPositions() {
        List<SourcePosition> list = new ArrayList<>(1);
        list.add(getPosition());
        return list;
    }

    /**
     * Applies the transformation having into consideration the parent transformation
     *
     * @param srcDir Path of the output directory
     * @throws Exception
     */
    @Override
    public void applyWithParent(String srcDir) throws Exception {
        if (parent != null) {
            parent.apply(srcDir);
        }
        apply(srcDir);
    }


    public void printJavaFile(String directory) throws IOException {
        CtType<?> type = getPosition().getCompilationUnit().getMainType();
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new DefaultJavaPrettyPrinter(env));
        //JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);
        processor.setOutputDirectory(new File(directory));

        processor.createJavaFile(type);
        Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
    }

//    /**
//     * gets the parent method of an element
//     * @param son
//     * @return
//     */
//    protected CtElement getParentMethod(CtElement son) {
//        CtElement parent = son.getParent();
//
//        while(parent != null && !(parent instanceof CtExecutable) ) {
//            parent = parent.getParent();
//        }
//        if(parent == null)
//            return son.getParent();
//        else
//            return parent;
//    }

    /**
     * Gets the line's end  of the source position of an element
     * @param exe element for which  we want to know the line's and
     * @return
     */
    protected int getLineEnd(CtElement exe) {
        if(exe instanceof CtExecutable && ((CtExecutable)exe).getBody() != null) {
            CtBlock body = ((CtExecutable) exe).getBody();
            int bodyEnd = body.getPosition().getEndLine();
            int stmtEnd = body.getLastStatement().getPosition().getEndLine();
            if(bodyEnd < stmtEnd)
                return stmtEnd+1;
            else
                return bodyEnd;
        }
        else
            return exe.getPosition().getEndLine()+1;
    }



}
