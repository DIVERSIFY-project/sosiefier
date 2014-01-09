public class Sort {

    int[] sort(int[] arr)
    {
       
            boolean changed = false;
            do {
                changed = false;
                for (int a = 0; a < arr.length - 1; a++) {
                    if (arr[a] > arr[a + 1]) {
                        int tmp = arr[a];
                        arr[a] = arr[a + 1];
                        arr[a + 1] = tmp;
                        changed = true;
                    }
                }
            } while (changed);
        return arr;
    }
}
