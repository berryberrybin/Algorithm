package array;

import java.util.ArrayList;

public class ConvertToBinary {
    public int[] convert(int n) {

        int nextNumber;
        int remainder;
        ArrayList<Integer> remainders = new <Integer>ArrayList();
        while (true) {
            remainder = n % 2;
            nextNumber = n / 2;
            remainders.add(remainder);
            n = nextNumber;
            if (n == 0) {
                break;
            }
        }
        int[] result = new int[remainders.size()];
        int size = remainders.size();
        for (int i = 0; i < size; i++) {
            result[i] = remainders.get(size - i-1);
        }
        // 10진수 n이 입력 됐을 때 n의 2진수를 배열로 반환하시오.
        return result;
    }
}
