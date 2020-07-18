package algorithm;

public class Tiling {
    public long combination(int a, int b) {
        long aFactorial = 1;
        long sumFactorial = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            aFactorial = aFactorial * i;
            aFactorial %= 1000000007;
        }
        for (int i = (a + b); i > Math.max(a, b); i--) {
            sumFactorial = sumFactorial * i;
            sumFactorial %= 1000000007;
        }
        return (sumFactorial / aFactorial) % 1000000007;
    }

    public int solution(int n) {
        int wRectangle = n / 2;
        long answer = 0;
        for (int i = 1; i <= wRectangle; i++) {
            int hRectangle = n - (2 * i);
            answer = answer + combination(i, hRectangle);
            answer = answer % 1000000007;
        }

        return (int) answer + 1;
    }

    public static void main(String[] args) {
        Tiling tiling = new Tiling();
        int n = 12;
        int answer = tiling.solution(n);
        System.out.println(answer);
    }
}
// https://programmers.co.kr/learn/courses/30/lessons/12900