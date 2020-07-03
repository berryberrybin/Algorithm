package string;

public class ReverseString {
    public String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        // 입력된 문자열 s를 거꾸로 변환하여 반환한다.
        return result;
    }
}
