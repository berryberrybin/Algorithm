package algorithm;

public class Tiling {
    public int solution(int n) {
        long answer = 0;
        long a=1;
        long b=2;
        long c=0;
        if(n==1){
            answer = 1;
        } else if(n==2){
            answer = 2;
        } else{
            for(int i=3;i<=n;i++){
                c = (a+b)%1000000007;
                a=b;
                b=c;
            }
            answer = c;
        }
        return (int)answer;
    }

    public static void main(String[] args) {
        Tiling tiling = new Tiling();
        int n = 3;
        int answer = tiling.solution(n);
        System.out.println(answer);
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12900