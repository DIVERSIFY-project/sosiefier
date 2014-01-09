import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * User: Simon
 * Date: 8/20/13
 * Time: 10:20 AM
 */
public class SortTest {

    @Test(timeout=1000)
    public void randomArrayTest() {
        for (int i = 0; i < 100; i++) {
//            System.out.println("randomSort:");
            int[] random = getRandomArray(new Random().nextInt(200)+1);
//            System.out.println(Arrays.toString(random));
//            System.out.println(Arrays.toString(sort(random)));
//            System.out.println(Arrays.toString( new Sort().sort(random)));
            assertArrayEquals(sort(random), new Sort().sort(random));
        }
    }

    @Test(timeout=1000)
    public void sortArrayTest() {
        for (int i = 0; i < 50; i++) {
            int[] random = getSortArray(new Random().nextInt(200)+1);
            assertArrayEquals(random, new Sort().sort(random));
        }
    }

    @Test(timeout=1000)
    public void reverseArrayTest() {
        for (int i = 0; i < 50; i++) {
//            System.out.println("reverseSort:");
            int[] random = getReverseArray(new Random().nextInt(200)+1);
//            System.out.println(Arrays.toString(random));
//            System.out.println(Arrays.toString(sort(random)));
//            System.out.println(Arrays.toString( new Sort().sort(random)));
            assertArrayEquals(sort(random), new Sort().sort(random));
        }
    }

    @Test(timeout=1000)
    public void equalArrayTest() {
        for (int i = 0; i < 50; i++) {
            int[] random = getEqualArray(new Random().nextInt(200)+1);
            assertArrayEquals(sort(random), new Sort().sort(random));
        }
    }

    @Test(timeout=1000)
    public void emptyArrayTest() {
        int[] random = new int[0];
        assertArrayEquals(sort(random), new Sort().sort(random));
    }

    private int[] sort(int[] array) {
        int[] sort = Arrays.copyOf(array,array.length);
        Arrays.sort(sort);
        return sort;
    }

    private int[] getRandomArray(int size) {
        int[] randomArray = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++)
            randomArray[i] = r.nextInt(size*100);

        return randomArray;
    }

    private int[] getSortArray(int size) {
        return sort(getRandomArray(size));
    }

    private int[] getReverseArray(int size) {
        int[] sort = getSortArray(size);
        int[] reverse = new int[size];

        for (int i = 0; i < size; i++){
            reverse[i] = sort[size-i-1];
        }
        return reverse;
    }

    private int[] getEqualArray(int size) {
        int[] equalArray = new int[size];
        int r = new Random().nextInt(size*100);
        for (int i = 0; i < size; i++)
            equalArray[i] = r;

        return equalArray;
    }
}
