package algorithm;

public class LeapMonth {
    public String solution(int a, int b) {
        int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;
        for (int i = 0; i < a - 1; i++) {
            date = date + daysOfMonth[i];
        }

        date = date + b;
        int remainder = date % 7;
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        String answer = week[remainder];
        return answer;
    }

    public static void main(String[] args) {
        LeapMonth leapMonth = new LeapMonth();
        String result = leapMonth.solution(5, 24);
        System.out.println(result);
    }
}
