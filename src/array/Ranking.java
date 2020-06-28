package array;

public class Ranking {
    public int[] rank(int[] array) {
        int[] rankArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    count++;
                }
            }
            rankArray[i] = count;
        }

        return rankArray;
    }
}
