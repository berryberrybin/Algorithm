package array;

public class BubbleSort {
    public int[] sort(int[] array) {
        // 입력된 배열의 오름차순으로 정렬된 배열이 반환된다.
        int number = 0;
        for (int round = 0; round < array.length - 1; round++) {
            for (int i = 0; i < array.length - round - 1; i++) {
                if (array[i] > array[i + 1]) {
                    number = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = number;
                }
            }
        }
        return array;
    }
}

