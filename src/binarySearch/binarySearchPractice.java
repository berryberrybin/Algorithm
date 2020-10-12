package binarySearch;

public class binarySearchPractice {
    public int binSearch(int[]a, int key){
        int n = a.length;
        int start = 0;
        int end = n-1;
        do {
            int middle = (start + end) / 2;
            if (a[middle] == key) {
                return middle; // 검색 성공
            } else if (a[middle] < key) { // 검색 범위를 뒤쪽 절반으로 좁힘
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
            while(start<=end);
            return -1;
        }
    public void print(int answer){
        if(answer==-1){
            System.out.println("찾는 값이 없습니다.");
        } else{
            System.out.println((answer+1)+"번째 있습니다.");
        }
    }
    public static void main(String[] args) {
        int[] a = {15,27,39,77,92,108,121};
        int key = 39;
        binarySearchPractice binarysearchpractice = new binarySearchPractice();
        int answer = binarysearchpractice.binSearch(a,key);
        binarysearchpractice.print(answer);
    }
}
