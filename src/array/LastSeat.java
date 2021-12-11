package array;

import java.util.Scanner;

public class LastSeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNumber = sc.nextInt(); //  사람 수 입력받음
        int moveCount = sc.nextInt(); // 마지막에 남는 친구 번호 입력 받음


        int[] people = new int[peopleNumber];
        for (int i = 0; i < peopleNumber; i++) {
            people[i] = i + 1;
        } // people 배열에 친구번호 차례로 넣음

        int countDropOut = 0; // 탈락한 친구수 저장
        int turnNumber = 0; //  turnNumber % peopleNumber = 현재 탐색하고 있는 친구 번호
        int i = 0;
        while (countDropOut != peopleNumber - 1) {
            if (i == moveCount - 1 && people[turnNumber % peopleNumber] != 0) { // 이동할 자리수만큼 이동했으며, 이미 탈락한 친구가 아닐경우
                people[turnNumber % peopleNumber] = 0; // 탈락할 친구번호를 0으로 변경
                countDropOut++; // 탈락한 친구수 증가
                i = 0; // 이동할 자리수 초기화
            }
            if (i != moveCount - 1 && people[turnNumber % peopleNumber] != 0) { // 이동할 자리수만큼 채워지지 않고, 이미 탈락한 친구가 아닐경우
                i++; // 이동할 자리수 증가
            }
            turnNumber++; // 현재 탐색하는 위치 증가
        }
        for (int k = 0; k < peopleNumber; k++) {
            if (people[k] != 0) {
                System.out.println(people[k]); // people 배열에서 0이 아닌 값 출력
            }
        }
    }
}
