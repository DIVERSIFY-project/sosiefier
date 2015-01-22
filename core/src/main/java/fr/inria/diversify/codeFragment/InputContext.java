package fr.inria.diversify.codeFragment;

import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InputContext {
    protected Set<CtVariableReference<?>> variableReferences;
    protected Integer hashCode = null;

    public InputContext(Set<CtVariableReference<?>> inputContext) {
        this.variableReferences = inputContext;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof InputContext))
            return false;
        return this.hashCode() == obj.hashCode();
    }

    protected Set<String> inputContextToString() {
        HashSet<String> result = new HashSet<>();
        for (CtVariableReference var : variableReferences) {
            result.add(var.getType().toString());
        }
        return result;
    }


    public List<CtVariableReference> allCandidate(CtTypeReference<?> type, boolean subType) {
        List<CtVariableReference> candidate = new ArrayList<>();

        for (CtVariableReference<?> var : variableReferences) {
            try {
                CtTypeReference<?> varType = var.getType();
                if (subType) {
                    if (type.isSubtypeOf(varType) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                        candidate.add(var);
                    }
                } else {
                    if (varType.equals(type) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                        candidate.add(var);
                    }
                }
            } catch (Throwable e) {
            }
        }
        return candidate;
    }

    public CtVariableReference<?> candidate(CtTypeReference<?> type, boolean subType) {
        for (CtVariableReference<?> var : variableReferences) {
            CtTypeReference<?> varType = var.getType();
            try {
                if (subType) {
                    if (type.isSubtypeOf(varType) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                        return var;
                    }
                } else {
                    if (varType.equals(type) && varType.getActualTypeArguments().equals(type.getActualTypeArguments())) {
                        return var;
                    }
                }
            } catch (Throwable e) {
            }
        }
        return null;
    }

    public boolean containsAll(InputContext other, boolean subType) {
        for (CtVariableReference<?> variable : other.variableReferences) {
            if (!hasCandidate(variable.getType(), subType)) return false;
        }
        return true;
        // return !other.variableReferences.stream().anyMatch(var -> !hasCandidate(var.getType(), subType));
        //
    }

    public CtVariableReference getVariableOrFieldNamed(String name) {
        CtVariableReference o = null;
        for ( CtVariableReference vf : getVar() ) {
            if ( vf.toString().equals(name) ) o = vf;
        }
        if (o == null && name.endsWith(")"))
            return getVariableOrFieldNamed(name.substring(1, name.length() - 1));
        return o;
    }

    public Set<String> getAllVarName() {
        HashSet<String> result = new HashSet<>();
        for (CtVariableReference var : variableReferences) result.add(var.getSimpleName());
        return result;
        /*
        return variableReferences.stream()
                .map(var -> var.getSimpleName())
                .collect(Collectors.toSet());
        */
    }

    protected boolean hasCandidate(CtTypeReference<?> type, boolean subType) {
        return candidate(type, subType) != null;
    }

    public Set<CtVariableReference<?>> getVar() {
        return variableReferences;
    }

    public String equalString() {
        HashSet<String> result = new HashSet<>();
        for (CtVariableReference var : variableReferences)
            result.add(var.getSimpleName() + ": " + var);
        return result.toString();

        //return variableReferences.stream()
        //        .map(var -> var.getSimpleName() + ": " + var)
        //        .collect(Collectors.toSet())
        //        .toString();
    }

    @Override
    public String toString() {
        return getVar().toString();
    }

    @Override
    public int hashCode() {
        if (hashCode == null)
            hashCode = inputContextToString().hashCode();
        return hashCode;
    }

    public int size() {
        return variableReferences.size();
    }

    public List<CtTypeReference<?>> getTypes() {
        List<CtTypeReference<?>> result = new ArrayList<>();
        for (CtVariableReference<?> var : variableReferences)
            result.add(var.getType());
        return result;

        //return variableReferences.stream()
        //        .map(var -> var.getType())
        //        .collect(Collectors.toList());
    }
}
