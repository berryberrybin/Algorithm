package array;

public class SelectionSort {
    public int[] sort(int[] array) {
        int number;
        int minLocation = 0;
        int min;
        for (int round = 0; round < array.length - 1; round++) {
            min = array[round];
            for (int i = round; i <= array.length - 1; i++) {
                if (min >= array[i]) {
                    min = array[i];
                    minLocation = i;
                }
            }
            number = array[round];
            array[round] = min;
            array[minLocation] = number;
        }
        return array;
    }
}