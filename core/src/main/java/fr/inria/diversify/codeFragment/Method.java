package fr.inria.diversify.codeFragment;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.reference.CtVariableReference;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User: Simon
 * Date: 09/06/16
 * Time: 10:36
 */
public class Method extends CodeFragment<CtMethod> {

    public Method(CtMethod method) {
        codeFragment = method;

        Set<CtVariableReference> varRefs = new HashSet<>();
        List<CtParameter> parameters = method.getParameters();
        for(CtParameter parameter : parameters) {
            varRefs.add(parameter.getReference());
        }

        context = new Context(new InputContext(varRefs), method.getType());
    }

    @Override
    public String codeFragmentString() {
        return codeFragment.toString();
    }

    @Override
    public boolean isReplaceableBy(CodeFragment other, boolean varNameMatch, boolean subType) {
        return other.getCodeFragmentType().equals(getCodeFragmentType());
    }

    @Override
    public CodeFragment clone() {
        return new Method(copyElem(codeFragment));
    }
}
