package set;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        Iterator hi = (Iterator) hs.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }
        //  HashSet 출력물 : 1, 2, 3
        //  ArrayList 출력물 : 1, 2, 2, 2, 3
        // SET과 LISt 차이점
        // - Set은 순서가 없는 집합이며 중복 없음
        // - List는 순서가 있으며 중복 허용

        HashSet<Integer> A = new HashSet();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // false - B의 원소 전체 값이 A에 담겨있는가?
        System.out.println(A.containsAll(C)); // ture - C의 원소 전체 값이 A에 담겨있는가?

        A.addAll(B); // A와 B를 합쳐서 A로 만든다 (합집합: 1, 2, 3, 4, 5)
        A.retainAll(B);//A집합과 B집합 모두 포함되는 값을 A에 담겠다 (교집합: 3)
        A.removeAll(B);//A에서 B를 뺀 차집합 (1, 2)
    }



}
