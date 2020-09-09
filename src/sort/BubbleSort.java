package sort;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {17, 13, 19, 15, 12, 16, 20, 14, 18};
        bubbleSort.bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}