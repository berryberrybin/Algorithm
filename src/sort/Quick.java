package sort;

public class Quick {
    public void quick(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right - 1;
        int pivot = arr[right];
        while (i < j) {
            while (arr[i] < pivot) i++;
            while (i < j && arr[j] > pivot) j--;
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
        if (pivot < arr[i]) {
            arr[right] = arr[i];
            arr[i] = pivot;
        }
        quick(arr, left, i - 1);
        quick(arr, i + 1, right);
    }

    public static void main(String[] args) {
        Quick quick = new Quick();

        int[] arr = {8, 2, 9, 1, 4, 5, 7, 3, 6};
        quick.quick(arr, 0, 8);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]);
        }
    }

}
