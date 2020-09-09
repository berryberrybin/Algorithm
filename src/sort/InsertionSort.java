package sort;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        for(int i=1; i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {17, 13, 19, 15, 12, 16, 20, 14, 18};
        insertionSort.insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}