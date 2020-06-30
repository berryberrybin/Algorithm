package array;

import java.util.HashSet;

public class IntersectionUnion {
    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> A = new HashSet();
        HashSet<Integer> B = new HashSet();
        for (int i = 0; i < a.length; i++) {
            A.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            B.add(b[i]);
        }
        A.retainAll(B);
        Integer[] result = new Integer[A.size()];
        A.toArray(result);
        // a, b의 교집합, 오름차순 정렬해서 반환할 것

        //return result;
        return null;
    }

    public int[] union(int[] a, int[] b) {
        HashSet<Integer> A = new HashSet();
        HashSet<Integer> B = new HashSet();
        for (int i = 0; i < a.length; i++) {
            A.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            B.add(b[i]);
        }
        A.addAll(B);
        Integer[] result = new Integer[A.size()];
        int[] unionResult = new int[A.size()];
        A.toArray(result);
        // a, b의 교집합, 오름차순 정렬해서 반환할 것
        //return result;
        // a, b의 합집합, 오름차순 정렬해서 반환할 것
        return null;
    }
}
