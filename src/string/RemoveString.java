package string;

public class RemoveString {
    public String remove(String s){
        String result="";
        if(s.length()<3){
            result="";
        }else{
            result=s.substring(1,s.length()-1);
        }
        // 입력된 문자열 s의 첫 글자와 마지막 글자를 제거한 후 반환한다.        
        return result;
    }
}
