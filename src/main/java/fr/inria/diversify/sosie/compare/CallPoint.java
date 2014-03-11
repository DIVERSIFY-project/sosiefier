package fr.inria.diversify.sosie.compare;

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
    public Diff getDiff(Point p) {
        return null;
    }
}