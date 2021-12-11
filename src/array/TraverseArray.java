package array;

import java.util.Scanner;

public class TraverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int widthSize = sc.nextInt();  // 가로 길이 입력
        int lengthSize = sc.nextInt(); // 세로 길이 입력
        String[] inputArrayData = sc.next().split(","); // 배열의 데이터를 입력 (콤마로 구분)
        int[][] arrayData = new int[lengthSize][widthSize];  // 2차원 배열 생성
        int k = 0;
        for (int i = 0; i < lengthSize; i++) {
            for (int j = 0; j < widthSize; j++) {
                arrayData[i][j] = Integer.parseInt(inputArrayData[k++]); // 문자열로 입력된 배열 값을 정수형태로 변경하여 배열에 저장
            }
        }

        int i = 0;
        int j = 0;
        boolean upward = true; // 대각선 위로 올라가는지 체크하는 플래그 변수
        while (true) {
            System.out.print(arrayData[i][j] + ", "); // 배열 값 출력
            if (i == lengthSize - 1 && j == widthSize - 1) { // 만약 마지막 값까지 왔으면 탐색 종료
                break;
            }
            if (upward) { // 대각선 위로 올라가는 순서일 때
                if (i == 0 && j != widthSize - 1) { // 오른쪽 칸으로 이동해야 한다면 오른쪽 칸으로 이동
                    j++;
                    upward = false;
                } else if (j == widthSize - 1) { // 아래 칸으로 이동해야 한다면 아래 칸으로 이동
                    i++;
                    upward = false;
                } else { // 그 외에는 대각선 위로 이동
                    i--;
                    j++;
                }
            } else { // 대각선 아래로 내려가는 순서일 때
                if (j == 0 && i != lengthSize - 1) { // 아래 칸으로 이동해야 한다면 아래 칸으로 이동
                    i++;
                    upward = true;
                } else if (i == lengthSize - 1) { // 오른쪽 칸으로 이동해야 한다면 오른쪽 칸으로 이동
                    j++;
                    upward = true;
                } else { // 그 외에는 대각선 아래로 이동
                    i++;
                    j--;
                }
            }
        }
    }
}


/*
3
3
1,2,3,4,5,6,7,8,9

4
6
1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24
 */