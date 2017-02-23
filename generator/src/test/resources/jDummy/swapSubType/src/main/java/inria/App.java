package inria;


import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        List<Integer> integerList = new LinkedList<Integer>();
        Collection<Integer> integerCollection = new TreeSet<Integer>();
        AbstractList<Integer> integerAbstractList = new Stack<Integer>();

        for(int i = 0; i < 5; i++) {
            integerList.add(i);
            integerCollection.add(i);
            integerAbstractList.add(i);
        }

        Iterator<Integer> it = integerCollection.iterator();
        for(int i = 0; i < 5; i++) {
            System.out.println(i + ": " + integerList.get(i));
            System.out.println(i + ": " + it.next());
            System.out.println(i + ": " + integerAbstractList.get(i));
        }
    }
}
