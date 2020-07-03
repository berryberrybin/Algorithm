package set;

import java.util.HashSet;

public class Lotto {
    public int[] pick() {
        HashSet<Integer> pickNumber = new HashSet();
        while (true) {
            double random = Math.random();
            int number = (int) (random * 45) + 1;
            pickNumber.add(number);
            if (pickNumber.size() == 6) {
                break;
            }
        }
        int[] result = new int[pickNumber.size()];
        int i = 0;
        for (int number : pickNumber) {
            result[i] = number;
            i++;
        }
        return result;
    }
}
