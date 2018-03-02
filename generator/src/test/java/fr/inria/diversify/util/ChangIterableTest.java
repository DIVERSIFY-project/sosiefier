package fr.inria.diversify.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class ChangIterableTest {
    @Test
    public void iterator() throws Exception {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        int i = 4;
        //ChangIterable<String,Iterable<String>> c = new ChangIterable<>(l);
        for(String s : new ChangIterable<>(l)) {
            System.out.println(s);
            assertEquals(s,l.get(--i));
        }
        i = 4;
        for(String s: new Iterable<String>() {
            List<String> list = new ArrayList<>();
            boolean initialized = false;

            void initia() {
                for (String o : l) list.add(o);
                initialized = true;
            }

            @Override
            public Iterator<String> iterator() {

                return new Iterator() {
                    int i = list.size() - 1;
                    List<String> l2 = list;

                    @Override
                    public boolean hasNext() {
                        if(!initialized) {initia();i = list.size() - 1;}
                        return i >= 0;
                    }

                    @Override
                    public String next() {
                        if(!initialized) {initia();i = list.size() - 1;}
                        return l2.get(i--);
                    }
                };
            }
        }) {
            System.out.println(s);
            assertEquals(s,l.get(--i));
        }
    }

}