package sort;

public class SelectionSort {
    public void selectionSort(int[] arr){
        for(int i=arr.length-1;i>0;i-- ){
            int max = i;
            for(int j = 0 ; j<i;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[max];
            arr[max] = tmp;
        }
    }
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {8,2,9,1,4,5,7,3,6};
        selectionSort.selectionSort(arr);
        for (int i  : arr) {
            System.out.print(i+" ");
        }
    }
}
