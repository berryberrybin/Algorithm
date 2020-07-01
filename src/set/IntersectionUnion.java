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
        int[] result = new int[A.size()];
        int i = 0;
        for (int number : A) {
            result[i] = number;
            i++;
        }
        // a, b의 교집합, 오름차순 정렬해서 반환할 것

        return result;

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
        int[] unionResult = new int[A.size()];
        int i = 0;
        for (int number : A) {
            unionResult[i] = number;
            i++;
        }
        return unionResult;
    }
}