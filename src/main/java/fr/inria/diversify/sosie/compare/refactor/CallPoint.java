package fr.inria.diversify.sosie.compare.refactor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CallPoint extends Point {
    @Override
    public boolean sameValue(Point p) {
        return false;
    }

    @Override
    protected void buildFrom(String string, Map<String, String> idMap) {

    }

    @Override
    public String toDot(Set varDiff) {
        return null;
    }

    @Override
    public Set<Diff> getDiff(Point p) {
        return null;
    }
}