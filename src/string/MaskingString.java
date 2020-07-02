package string;

public class MaskingString {
    public String masking(String s) {
        /*
        String result = s;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a') {
                if (i == 0) {
                    result = '*' + result.substring(1);
                } else if (i == s.length() - 1) {
                    result = result.substring(0, i) + '*';
                } else {
                    result = result.substring(0, i ) + '*' + result.substring(i + 1);
                }
            }
        }
        // 입력된 문자열 s의 'A'와 'a' 문자를 '*'로 변경하여 반환한다.
        return result;

         */
        String result2="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a') {
                result2 = result2 + '*';
            } else {
                result2 = result2 + s.charAt(i);
            }
        }
        return result2;
    }
}
