package programers;

public class Problem1 {
    public int solution(String word) {
        String[] aeiou = new String[]{"A","E","I","O","U"};
        String str ="";
        int count = 0;
        for(int i=0;i<5;i++){
            str = aeiou[i];
            count++;
            if(word.equals(str)){
                return count;
            }
            for(int j=0;j<5;j++){
                str +=aeiou[j];
                count++;
                if(word.equals(str)){
                    return count;
                }
                for(int k=0;k<5;k++){
                    str +=aeiou[k];
                    count++;
                    if(word.equals(str)){
                        return count;
                    }
                    for(int l=0;l<5;l++){
                        str +=aeiou[l];
                        count++;
                        if(word.equals(str)){
                            return count;
                        }
                        for(int m=0;m<5;m++){
                            str +=aeiou[m];
                            count++;
                            if(word.equals(str)){
                                return count;
                            }
                            str = str.substring(0,4);
                        }
                        str = str.substring(0,3);
                    }
                    str = str.substring(0,2);
                }
                str = str.substring(0,1);
            }
            str = str.substring(0,0);
        }
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int result = new Problem1().solution("AAAAE");
        System.out.println(result);
    }

}
