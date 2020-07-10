package algorithm;

import java.util.ArrayList;

public class StringSort {

    public String[] solution(String[] strings, int n) {
        char[] kthChar = new char[strings.length];
        for(int i=0;i< strings.length;i++){
            kthChar[i] =strings[i].charAt(n);
        }
        int[] kthCharToInt = new int[strings.length];
        for(int i=0;i<kthChar.length;i++){
            kthCharToInt[i]=(int)kthChar[i];
        }
        ArrayList<String> stringsSort = new ArrayList<>();
        for(int i=97;i<=122;i++){
            for(int j=0;j<kthCharToInt.length;j++){
                if(i==kthChar[j]){
                    stringsSort.add(strings[j]);
                }
            }
        }
        String[] answer= new String[strings.length];

        for(int i=0;i<stringsSort.size();i++){
            answer[i]= stringsSort.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        StringSort stringsort = new StringSort();
        String [] strings = {"sun", "bed", "car"};
        String[] result = stringsort.solution(strings,1);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
    }
}
