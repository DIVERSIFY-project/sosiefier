package fr.inria.diversify.persistence;

/**
 * Created by marodrig on 08/01/2015.
 */
public class PersistenceException extends RuntimeException {

    public PersistenceException(String msg, Exception e) {
        super(msg, e);
    }

    public PersistenceException(String s) {
        super(s);
    }

    public PersistenceException(Exception e) {
        super(e);
    }
}
