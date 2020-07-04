package array;

import java.util.Random;

public class LottoArray {

    public static int[] bubbleSort(int[] numbers) {
        int temp = 0;
        for (int round = 0; round < numbers.length - 1; round++) {
            for (int i = 0; i < numbers.length - round - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        return numbers;
    } // bubblesort 정렬 메소드

    private static int[] makeLottoNumber() {
        Random rand = new Random();
        int[] numbers = new int[6];
        int checkNumber = 0;
        for (int i = 0; i < 6; i++) {
            checkNumber = (rand.nextInt(45) + 1);
            numbers[i] = checkNumber;
            for (int j = 0; j < i; j++) {
                if (checkNumber == numbers[j]) {
                    i = i - 1;
                    break;
                }
            }
        }

        numbers = bubbleSort(numbers);
        return numbers;
    } // 로또 숫자 6개 뽑기 메소드

    public static void main(String[] args) {
        int n=10;
        int[][] fullLottoArray = new int[n][];
        for(int i=0;i<n;i++) {
            int[] numbers = makeLottoNumber();
            fullLottoArray[i]= numbers;
        }

        for(int[] numbers : fullLottoArray) {
            System.out.print("로또");
            for (int number : numbers) {
                System.out.print("|" + number);
            }
            System.out.println();
        }
    }

}

