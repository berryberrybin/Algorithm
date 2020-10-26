package sort;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import javax.imageio.stream.ImageInputStream;

public class QuickSort {
    public void quickSort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;
        if (left < right) {
            i = left;
            j = right;
            pivot = arr[left];
            while (i < j) {
                while (arr[j] > pivot) j--;
                while (i < j && arr[i] <= pivot) i++;
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j]=tmp;

            }
            arr[left] = arr[i];
            arr[i] = pivot;

            quickSort(arr, left, i - 1);
            quickSort(arr, i +1, right);
        }
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = {8,2,9,1,4,5,7,3,6};
        quickSort.quickSort(arr, 0, 8);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i]);
        }
    }

}
