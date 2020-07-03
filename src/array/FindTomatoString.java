package array;

import java.util.ArrayList;

public class FindTomatoString {
    public String[] find(String str) {
        String cutStr = "";
        String reverseStr = "";
        ArrayList<String> result = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    cutStr = str.substring(i, j + 1);
                    for (int k = cutStr.length() - 1; k >= 0; k--) {
                        reverseStr = reverseStr + cutStr.charAt(k);
                    }
                    if (cutStr.equals(reverseStr)) {
                        result.add(cutStr);

                    }
                }
                cutStr = "";
                reverseStr = "";
            }
        }
        String[] answer = new String[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "total_level";
        FindTomatoString test = new FindTomatoString();
        String[] a = test.find(str);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

// 입력된 str 중 2글자 이상 부분 문자열 중 앞으로 읽으나 뒤로 읽으나 같은 문자열을 찾아 배열에 넣고 반환하시오.
// 부분 문자열이란 연속된 문자열을 의미함
// 예) str="total_level" 인 경우 반환 배열은 tot, l_l, level, eve
//substring, equals(문자열이 같은지),
