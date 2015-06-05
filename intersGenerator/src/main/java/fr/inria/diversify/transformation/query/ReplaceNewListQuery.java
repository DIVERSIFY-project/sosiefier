package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.statistic.SystemInformation;
import fr.inria.diversify.transformation.ReplaceNewListTransformation;
import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtLocalVariableImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by lguerin on 5/29/15.
 */
public class ReplaceNewListQuery extends TransformationQuery{

    public ReplaceNewListQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public Transformation query() throws QueryException {
        ReplaceNewListTransformation transformation = new ReplaceNewListTransformation();
        List<CtElement> newClasses = getInputProgram().getAllElement(CtConstructorCall.class);

        for(int i=0;i<newClasses.size();i++){

            if(newClasses.get(i).getParent() instanceof CtLocalVariableImpl ){

                if(((CtLocalVariableImpl) newClasses.get(i).getParent()).getType().toString().startsWith("java.util.List")){
                    transformation.setTransplantationPoint((CtConstructorCall)newClasses.get(i));

                    return transformation;
                }
            }
        }

        return null;
    }
}
