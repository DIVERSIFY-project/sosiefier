import java.util.Arrays;
public class Sort {

    int[] sort(int[] arr)
    {
        if (arr.length > 1) {
            int pivot = arr[0]; //This pivot can change to get faster results


            int[] less = new int[arr.length];
            int[] pivotList = new int[arr.length];
            int[] more = new int[arr.length];

            int indexLess = 0;
            int indexPivot = 0;
            int indexMore = 0;
            // Partition
            for (int i = 0; i< arr.length; i++) {
                int value = arr[i];
                if (value < pivot) {
                    less[indexLess] = value;
                    indexLess++;
                }
                if (value > pivot) { // else if (value > pivot)
                    more[indexMore] = value;
                    indexMore++;
                }
                if (value == pivot) { //else
                    pivotList[indexPivot] = value;
                    indexPivot++;
                }
            }
            // Recursively sort sublists
            less = sort(Arrays.copyOf(less,indexLess));
            more = sort(Arrays.copyOf(more,indexMore));
            // Concatenate results
            int[] ret = new int[arr.length];
            for (int i = 0; i < indexLess; i++) {
                ret[i] = less[i];
            }
            for (int i = 0; i < indexPivot; i++) {
                ret[indexLess+i] = pivotList[i];
            }
            for (int i = 0; i < indexMore; i++) {
                ret[indexLess+indexPivot+i] = more[i];
            }
            return ret;
        }
        return arr;
    }
}
