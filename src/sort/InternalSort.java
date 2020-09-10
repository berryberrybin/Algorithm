package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
// 타입에 따라 정렬 : 자바 내부에 있는 정렬 메소드인 "Arrays.sort(비교할 객체명, new Comparator<객체의타입>() )"를 사용
// Comparator 인터페이스 이므로 추상메서드인 compare를 override 해주어야 함 - 어떤 방식으로 정렬을 할지

public class InternalSort {
    public void intSort(int[][] array){
        Comparator<int[]> c = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0]+o1[1]+o1[2],o2[0]+o2[1]+o2[2]);
            }
        };
        Arrays.sort(array, c);
    }
    public void stringSort(String[] strArray){
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(1) == o2.charAt(1)){
                    return Character.compare(o1.charAt(0),o2.charAt(0));
                }
                return Character.compare(o1.charAt(1),o2.charAt(1));
            }
        });
    }
    public void customSort(Custom[] customArray){
        Arrays.sort(customArray, new Comparator<Custom>() {
            @Override
            public int compare(Custom o1, Custom o2) {
                return o1.getB().compareTo(o2.getB())*-1;
            }
        });
    }
    static class Custom {
        int a;
        String b;

        Custom(int a, String b) {
            this.a = a;
            this.b = b;
        }
        public String getB(){
            return b;
        }
        public int getA(){
            return a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Custom custom = (Custom) o;
            return a == custom.a &&
                    Objects.equals(b, custom.b);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public static void main(String[] args) {
        InternalSort internalSort = new InternalSort();
        String[] strArray = {"ab", "cd", "da", "ef", "qs", "bs", "fe", "ca"};
        // 두번째 글자 기준으로 정렬
        internalSort.stringSort(strArray);
        for(String s : strArray){
            System.out.print(s + " ");
        }
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {2, 3, 1}, {5, 3, 1}, {1, 1, 1}, {7, 4, 2}, {1, 6, 2}};
        // 0, 1, 2 번지 총 합으로 정렬
        internalSort.intSort(intArray);
        for(int[] i : intArray){
            for(int j = 0 ; j<i.length;j++){
                System.out.print(i[j]);
            }
            System.out.println();
        }
        Custom[] customArray = {new Custom(1, "a"), new Custom(10, "y"), new Custom(3, "g"), new Custom(12, "d")};
        // custom의 b 문자열 역순으로 정렬
        internalSort.customSort(customArray);
        for(Custom i : customArray ){
            System.out.print(i.getA() + " ");
            System.out.print(i.getB());
            System.out.println();
        }
    }
}
