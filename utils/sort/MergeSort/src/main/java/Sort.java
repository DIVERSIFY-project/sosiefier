import java.lang.System;
import java.util.Arrays;
public class Sort {

    public int[] sort(int[] m)
    {
        if (m.length <= 1)
            return m;
        
        int middle = m.length / 2;
        int[] left = Arrays.copyOf(m,middle);
        int[] right = Arrays.copyOfRange(m,middle,m.length);

        right = sort(right);
        left = sort(left);
        int[] result = merge(left, right);
        return result;
    }
        
        public int[] merge(int[] left, int[] right) {
            int[] result = new int[left.length + right.length];
            int indexLeft = 0;
            int indexRigth = 0;
            boolean noEnd = true;
            while (noEnd) {
                if (left[indexLeft] <= right[indexRigth]) {
                    result[indexLeft + indexRigth] = left[indexLeft];
                    indexLeft++;
                    if (indexLeft == left.length) {
                        for (int i = indexRigth; i < right.length; i++)
                            result[indexLeft + i] = right[i];
                        noEnd = false;
                    }
                } else {
                    result[indexLeft + indexRigth] = right[indexRigth];
                    indexRigth++;
                    if (indexRigth == right.length) {
                        for (int i = indexLeft; i < left.length; i++)
                            result[i + indexRigth] = left[i];
                        noEnd = false;
                    }
                }
            }
            return result;
        }
}
