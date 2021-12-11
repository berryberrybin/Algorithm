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
        for (int i = 0; i < rotateOrder.length; i++) {
            if (rotateOrder[i].equals("R")) {
                int[][] resultRightRotate = new int[arrayData[0].length][arrayData.length];
                for (int m = 0; m < arrayData.length; m++) {
                    for (int n = 0; n < arrayData[0].length; n++) {
                        resultRightRotate[n][arrayData.length - 1 - m] = arrayData[m][n];
                    }
                }
                arrayData = resultRightRotate;
            } else if (rotateOrder[i].equals("L")) {
                int[][] resultLeftRotate = new int[arrayData[0].length][arrayData.length];
                for (int m = 0; m < arrayData.length; m++) {
                    for (int n = 0; n < arrayData[0].length; n++) {
                        resultLeftRotate[n][m] = arrayData[m][n];
                    }
                }
                arrayData = resultLeftRotate;
            } else {
                int[][] resultReverseRotate = new int[arrayData.length][arrayData[0].length];
                for (int m = 0; m < arrayData.length; m++) {
                    for (int n = 0; n < arrayData[0].length; n++) {
                        resultReverseRotate[m][arrayData[0].length - 1 - n] = arrayData[m][n];
                    }
                }
                arrayData = resultReverseRotate;
            }
        }
        int answer = arrayData[Integer.parseInt(answerNumberLocation[1]) - 1][Integer.parseInt(answerNumberLocation[0]) - 1];
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