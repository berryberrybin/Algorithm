package array;

public class SelectionSort {
    public int[] sort(int[] array) {
        int minLocation;
        for (int round = 0; round < array.length - 1; round++) {
            minLocation = round;
            for (int i = round; i <= array.length - 1; i++) {
                if (array[minLocation] > array[i]) {
                    minLocation = i;
                }
            }
            int temp = array[round];
            array[round] = array[minLocation];
            array[minLocation] = temp;
        }
        return array;
    }
}