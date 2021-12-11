package string;

import java.util.Scanner;

public class TimeInterval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] startTime = sc.next().split(":"); // 시작시간 :를 기준으로 구분하여 String에 저장
        String[] endTime = sc.next().split(":"); // 종료시간 :를 기준으로 구분하여 String에 저장

        int startHour = Integer.parseInt(startTime[0]); // 시작시간 HH 숫자로 변환
        int startMinute = Integer.parseInt(startTime[1]); // 시작시간 MM 숫자로 변환
        int endHour = Integer.parseInt(endTime[0]); // 종료시간 HH 숫자로 변환
        int endMinute = Integer.parseInt(endTime[1]); // 종료시간 MM 숫자로 변환

        int intervalHour = 0; // HH 차이
        int intervalMinute = 0; // MM 차이
        if (endMinute >= startMinute) { // 종료 MM이 시작 MM 보다 크거나 같을때
            intervalMinute = endMinute - startMinute; // 종료 MM - 시작 MM
            if (endHour >= startHour) {  // 종료 HH가 시작 HH 보다 크거나 같을때
                intervalHour = endHour - startHour; // 종료 HH - 시작 HH
            } else {
                intervalHour = 24 - startHour + endHour; // 종료 HH가 시작 HH 보다 작으면 24 - 시작 HH + 종료 HH 수행
            }
        } else { // 종료 MM이 시작 MM 보다 작을때
            intervalMinute = 60 - startMinute + endMinute;  // 60 -  시작 MM + 종료 MM 수행
            if (endHour >= startHour) { //  종료 HH가 시작 HH 보다 클거나 같을때
                intervalHour = endHour - 1 - startHour; // 종료 HH - 1 - 시작 HH

            } else { // 종료 HH가 시작 HH 보다 작을때
                intervalHour = 24 - startHour + endHour; // 24 - 시작HH + 종료HH
            }
        }
        int answer = (intervalHour * 60) + intervalMinute; // 분단위 시간 간격 = HH 시간 간격 * 60 + MM 시간 간격
        System.out.println("출력 : " + answer);
        sc.close();
    }

}
