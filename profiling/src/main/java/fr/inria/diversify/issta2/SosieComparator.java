package fr.inria.diversify.issta2;

import fr.inria.diversify.transformation.SingleTransformation;

/**
 * User: Simon
 * Date: 18/06/15
 * Time: 10:26
 */
public interface SosieComparator {
    void compare(SingleTransformation trans) throws Exception;

    void  init(String tmpDir) throws Exception;
}
