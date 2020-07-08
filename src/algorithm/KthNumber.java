package algorithm;

import java.util.ArrayList;

public class KthNumber {
    private int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            int[] cutArray = new int[commands[i][1] - commands[i][0] + 1];
            for (int j = 0; j < cutArray.length; j++) {
                cutArray[j] = array[commands[i][0] - 1 + j];
            }
            int[] result = sortArray(cutArray);
            answerList.add(result[(commands[i][2]) - 1]);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

}

//https://programmers.co.kr/learn/courses/30/lessons/42748