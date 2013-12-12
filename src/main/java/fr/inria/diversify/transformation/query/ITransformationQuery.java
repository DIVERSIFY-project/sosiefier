package fr.inria.diversify.transformation.query;

import fr.inria.diversify.transformation.Transformation;

import java.util.Random;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public interface ITransformationQuery {

    public void setNbTransformation(int n);
    public void setType(String type);

    public Transformation getTransformation() throws Exception;

    public Transformation delete() throws Exception ;

    public Transformation add() throws Exception ;

    public Transformation replace() throws Exception ;

}
