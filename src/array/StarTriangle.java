package array;

public class StarTriangle {
    public static void main(String[] args) {
        char[][] result = new StarTriangle().star(3);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public char[][] star(int n) {
        char[][] starTriangle = new char[n][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                starTriangle[i][j] = ' ';
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                starTriangle[i][n - i - 1 + j] = '*';
            }
        }
        return starTriangle;
    }
}