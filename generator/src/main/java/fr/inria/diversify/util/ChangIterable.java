package fr.inria.diversify.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChangIterable<U,T extends Iterable<U>> implements Iterable<U> {
    private T iterable;

    public ChangIterable(T iterable) {
        this.iterable = iterable;
    }

    @Override
    public Iterator<U> iterator() {
        List<U> list = new ArrayList<>();
        for(U o: iterable) list.add(o);
        return new Iterator() {
            int i = list.size()-1;
            List<U> l = list;
            @Override
            public boolean hasNext() {
                return i >= 0;
            }

            @Override
            public U next() {
                return l.get(i--);
            }
        };
    }
}
