package fr.inria.diversify.transformation.query;

import fr.inria.diversify.transformation.ITransformation;

import java.util.Random;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 18:09
 */
public interface ITransformationQuery {

    public void setNbTransformation(int n);
    public void setType(String type);

    public ITransformation getTransformation() throws Exception;

    public ITransformation delete() throws Exception ;

    public ITransformation add() throws Exception ;

    public ITransformation replace() throws Exception ;

}
