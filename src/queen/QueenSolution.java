package queen;

public class QueenSolution {
    private int n;
    private int count;
    private boolean[] checkRow;
    private boolean[] checkLeftDiagonal;
    private boolean[] checkRightDiagonal;

    public int solution(int n) {
        initialize(n);
        set(0);
        return count;
    }

    private void initialize(int n) {
        this.n = n;
        count = 0;
        checkRow = new boolean[n];
        checkLeftDiagonal = new boolean[(2 * n) - 1];
        checkRightDiagonal = new boolean[(2 * n) - 1];
    }

    private void set(int i) {
        if (i == n) {
            count++;
            return;
        }
        for (int j = 0; j < n; j++) {
            if (checkRow[j] || checkLeftDiagonal[i + j] || checkRightDiagonal[i - j + (n - 1)]) {
                continue;
            }
            checkRow[j] = checkLeftDiagonal[i + j] = checkRightDiagonal[i - j + (n - 1)] = true;
            set(i + 1);
            checkRow[j] = checkLeftDiagonal[i + j] = checkRightDiagonal[i - j + (n - 1)] = false;
        }
    }

    public static void main(String[] args) {
        QueenSolution queensolution = new QueenSolution();
        int result = queensolution.solution(8);
        System.out.println(result);
    }
}
