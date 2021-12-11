package string;

import java.util.Scanner;

public class TimeInterval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] startTime = sc.next().split(":");
        String[] endTime = sc.next().split(":");

        int startHour = Integer.parseInt(startTime[0]);
        int startMinute = Integer.parseInt(startTime[1]);
        int endHour = Integer.parseInt(endTime[0]);
        int endMinute = Integer.parseInt(endTime[1]);

        int intervalHour = 0;
        int intervalMinute = 0;
        if (endMinute >= startMinute) {
            intervalMinute = endMinute - startMinute;
            if (endHour >= startHour) {
                intervalHour = endHour - startHour;
            } else {
                intervalHour = 24 - startHour + endHour;
            }
        } else {
            intervalMinute = 60 - startMinute + endMinute;
            if (endHour >= startHour) {
                intervalHour = endHour - 1 - startHour;

            } else {
                intervalHour = 24 - startHour + endHour;
            }
        }
        int answer = (intervalHour * 60) + intervalMinute;
        System.out.println("출력 : " + answer);
        sc.close();
    }

}
