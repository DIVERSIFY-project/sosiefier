package fr.inria.diversify.transformation.ast.exception;

/**
 * Created by Simon on 30/10/14.
 */
public class ApplyTransformationException extends Exception {

    public ApplyTransformationException(String s, Exception e) {
        super(s,e);
    }
}
