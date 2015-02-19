package fr.inria.diversify.transformation;

import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;

import java.io.IOException;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 11:16
 */
public abstract class SingleTransformation extends Transformation {


    public abstract String classLocationName();
    public abstract String packageLocationName();
    public abstract String methodLocationName();
//    public abstract String stmtType();

    //public default String getTransformationString() throws Exception {return "";}
    public abstract String getTransformationString() throws Exception;

    public abstract int line();

    public abstract void printJavaFile(String srcDir) throws IOException;


    /**
     * gets the parent method of an element
     * @param son
     * @return
     */
    protected CtElement getParentMethod(CtElement son) {
        CtElement parent = son.getParent();

        while(parent != null && !(parent instanceof CtExecutable) ) {
            parent = parent.getParent();
        }
        if(parent == null)
            return son.getParent();
        else
            return parent;
    }

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
