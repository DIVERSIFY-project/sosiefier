package fr.inria.diversify.transformation.ast.exception;

/**
 * Created by Simon on 30/10/14.
 */
public class BuildTransplantException extends Exception {

    public BuildTransplantException(String s, Exception e) {
        super(s,e);
    }

    public BuildTransplantException(String s) {
        super(s);
    }
}
