package fr.inria.diversify.ut.persistence.json;

import fr.inria.diversify.codeFragment.CodeFragment;

/**
 * Created by marodrig on 09/01/2015.
 */
public class FakeCodeFragment extends CodeFragment {
    private final String position;
    private final String type;
    private final String source;

/*
*     JSONObject object = new JSONObject();
        object.put("position", fragment.positionString());
        object.put("type", fragment.getCodeFragmentType().getSimpleName());
        object.put("sourcecode", fragment.equalString());
        //object.put("inputContext", new JSONArray(getInputContext().inputContextToString()));
        //object.put("outputContext", getOutputContext().toString());
        return object;
* */

    public FakeCodeFragment(String position, String type, String source) {
        this.position = position;
        this.type = type;
        this.source = source;
    }

    @Override
    public String positionString() {
        return position;
    }

    @Override
    public String equalString() {
        return source;
    }

    @Override
    public String getCodeFragmentTypeSimpleName() {
        return type;
    }

    @Override
    public String codeFragmentString() {
        return null;
    }

    @Override
    public boolean isReplaceableBy(CodeFragment other, boolean varNameMatch, boolean subType) {
        return false;
    }

    @Override
    public CodeFragment clone() {
        return null;
    }
}
