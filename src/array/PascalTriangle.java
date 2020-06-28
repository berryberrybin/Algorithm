package array;

public class PascalTriangle {
    public int[][] make(int n) {
        int[][] Pascal = new int[n][];
        for (int i = 0; i < n; i++) {
            Pascal[i] = new int[i + 1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < Pascal[i].length; j++) {
                if (j == 0) {
                    Pascal[i][j] = 1;
                } else if (i == j) {
                    Pascal[i][j] = 1;
                } else {
                    Pascal[i][j] = Pascal[i - 1][j - 1] + Pascal[i - 1][j];
                }
            }
        }
        return Pascal;
    }

    public static void main(String[] args) {
        PascalTriangle p = new PascalTriangle();
        int[][] result = p.make(10);
//        int[][] result2 = new PascalTriangle().make(10);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}

