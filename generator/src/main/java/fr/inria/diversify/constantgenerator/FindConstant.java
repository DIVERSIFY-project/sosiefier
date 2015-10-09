package fr.inria.diversify.constantgenerator;

import fr.inria.diversify.diversification.InputProgram;
import spoon.reflect.code.CtLiteral;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 30/03/15
 */
public class FindConstant {
    protected InputProgram inputProgram;

    public Collection<CtLiteral> getNumbers() {
        return  inputProgram.getAllElement(CtLiteral.class).stream()
                .map(lit -> ((CtLiteral) lit))
                .filter(lit -> lit.getValue() instanceof Number)
                .collect(Collectors.toList());
    }


    public Collection<CtLiteral> getStrings() {
        return  inputProgram.getAllElement(CtLiteral.class).stream()
                .map(lit -> ((CtLiteral) lit))
                .filter(lit -> lit.getValue() instanceof String)
                .collect(Collectors.toList());
    }
}
