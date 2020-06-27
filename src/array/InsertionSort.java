package array;

public class InsertionSort {
    public int[] sort(int[] array) {
        for (int round = 1; round < array.length; round++) {
            int i = 0;
            int temp = array[round];
            for (i = round - 1; i >= 0; i--) {
                if (array[i] >= temp) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = temp;
        }
        return array;
    }
}
