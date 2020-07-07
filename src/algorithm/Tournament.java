package algorithm;

public class Tournament {
    public int solution(int n, int a, int b) {
        int min;
        int max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        int maxRange = n;
        for (int i = n; i > 2; i = i / 2) {
            if (min <= (i / 2) && (i / 2) < max) {
                maxRange = i;
                break;
            } else if (min > (i / 2) && (i / 2) < max) {
                min = min - (i / 2);
                max = max - (i / 2);
                maxRange = i/2;
            } else {
                maxRange = i / 2;
            }
        }
        int answer = 0;
        for (int i = 2; i <= maxRange; i = i * 2) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        int result = tournament.solution(4, 3, 4);
        System.out.println(result);
    }
}
