package array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int widthSize = sc.nextInt();  // 가로 길이 입력
        int lengthSize = sc.nextInt(); // 세로 길이 입력
        String[] inputArrayData = sc.next().split(","); // 배열의 데이터를 입력 (콤마로 구분)
        String[] rotateOrder = sc.next().split(""); // 회전 명령어 입력
        String[] answerNumberLocation = sc.next().split(","); // 출력할 배열 위치

        int[][] arrayData = new int[lengthSize][widthSize];  // 2차원 배열 생성
        int k = 0;
        for (int i = 0; i < lengthSize; i++) {
            for (int j = 0; j < widthSize; j++) {
                arrayData[i][j] = Integer.parseInt(inputArrayData[k++]); // 문자열로 입력된 배열 값을 정수형태로 변경하여 배열에 저장
            }
        }
        for (int i = 0; i < rotateOrder.length; i++) { // 회전명령어를 차례로 수행
            if (rotateOrder[i].equals("R")) { // R 입력받은 경우 오른쪽으로 회전
                int[][] resultRightRotate = new int[arrayData[0].length][arrayData.length];
                for (int m = 0; m < arrayData.length; m++) {
                    for (int n = 0; n < arrayData[0].length; n++) {
                        resultRightRotate[n][arrayData.length - 1 - m] = arrayData[m][n]; // 오른쪽 회전시 인덱스 위치로 변경
                    }
                }
                arrayData = resultRightRotate; // arrayData 갱신
            } else if (rotateOrder[i].equals("L")) { // L 입력받은 경우 왼쪽으로 회전
                int[][] resultLeftRotate = new int[arrayData[0].length][arrayData.length];
                for (int m = 0; m < arrayData.length; m++) {
                    for (int n = 0; n < arrayData[0].length; n++) {
                        resultLeftRotate[n][m] = arrayData[m][n]; // 왼쪽 회전시 인덱스 위치로 변경
                    }
                }
                arrayData = resultLeftRotate; // arrayData 갱신
            } else { // R이나 L이아니면 뒤집기 수행
                int[][] resultReverseRotate = new int[arrayData.length][arrayData[0].length];
                for (int m = 0; m < arrayData.length; m++) {
                    for (int n = 0; n < arrayData[0].length; n++) {
                        resultReverseRotate[m][arrayData[0].length - 1 - n] = arrayData[m][n]; // 뒤집을 경우 인덱스 위치로 변경
                    }
                }
                arrayData = resultReverseRotate; // arrayData 갱신
            }
        }
        int answer = arrayData[Integer.parseInt(answerNumberLocation[1]) - 1][Integer.parseInt(answerNumberLocation[0]) - 1]; // 입력받은 출력할 배열 위치에 저장된 값
        System.out.println(answer);
    }
}

/*
3
3
1,2,3,4,5,6,7,8,9
RRT
1,3
 */