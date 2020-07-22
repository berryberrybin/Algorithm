package algorithm;

public class NumberGame {
    public int[] sort(int[] array) {
        int number = 0;
        for (int round = 0; round < array.length - 1; round++) {
            for (int i = 0; i < array.length - round - 1; i++) {
                if (array[i] < array[i + 1]) {
                    number = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = number;
                }
            }
        }
        return array;
    }

    public int solution(int[] A, int[] B) {
        int count = 0;
        int[] sortA = sort(A);
        int[] sortB = sort(B);
        int[] moreBigNumber = new int[sortA.length];
        for (int i = 0; i < sortA.length; i++) {
            for (int j = 0; j < sortB.length; j++) {
                if (sortA[i] >= sortB[j]) {
                    moreBigNumber[i] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (moreBigNumber[i] != 0) {
                for (int j = 0; j < moreBigNumber.length; j++) {
                    moreBigNumber[j] = moreBigNumber[j] - 1;
                }
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumberGame numbergame = new NumberGame();
        int[] A = {8, 6, 6, 5, 3, 1, 1};
        int[] B = {7, 6, 5, 4, 3, 3, 1};
        System.out.println(numbergame.solution(A, B));
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/12987