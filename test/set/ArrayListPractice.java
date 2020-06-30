package set;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        // 배열
        String[] arrayObj = new String[2];
        arrayObj[0] = "OneArray";
        arrayObj[1] = "TwoArray";
        for (int i = 0; i < arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

        // ArrayList (import 필요)
        ArrayList al = new ArrayList();
        al.add("OneArrayList");
        al.add("TwoArrayList");
        // ArrayList의 메소드 add는 어떤 형태의 값이 올지 알 수 없기 때문에
        // 모든 데이터 타입의 조상인 Object 형식으로 데이터를 받고 있다
        for (int i = 0; i < al.size(); i++) {
            String value = (String) al.get(i);
            System.out.println(value);
        }

        ArrayList<String> example = new ArrayList<String>();
        example.add("EX1");
        example.add("EX2");

    }
}
