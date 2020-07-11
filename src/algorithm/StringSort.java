package algorithm;


public class StringSort {

    public String[] solution(String[] strings, int n) {
        int minLocation = 0;
        for (int i = 0; i < strings.length - 1; i++) {
            minLocation = i;
            for (int j = i; j < strings.length; j++) {
                if (strings[minLocation].charAt(n) > strings[j].charAt(n)) {
                    minLocation = j;
                } else if(strings[minLocation].charAt(n) == strings[j].charAt(n)){
                    if(strings[minLocation].compareTo(strings[j])>0){
                        minLocation = j;
                    }
                }
            }
            String minString=strings[minLocation];
            strings[minLocation] = strings[i];
            strings[i] = minString;
        }
        return strings;
    }

    public static void main(String[] args) {
        StringSort stringsort = new StringSort();
        String[] strings = {"sun", "bed", "car","bar"};
        String[] result = stringsort.solution(strings, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
// kthCharToInt가 같을때 재정렬 필요.