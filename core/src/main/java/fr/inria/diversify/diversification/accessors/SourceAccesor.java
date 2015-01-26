package fr.inria.diversify.diversification.accessors;

import fr.inria.diversify.codeFragment.CodeFragment;

/**
 * Created by marodrig on 22/01/2015.
 */
public class SourceAccesor implements Accessor<CodeFragment, String> {
    /**
     * Access the the property's value of T
     *
     * @param cf the accessed object
     * @return the property's value result
     */
    @Override
    public String getValue(CodeFragment cf) {
        return cf.equalString();
    }
}
