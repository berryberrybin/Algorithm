package algorithm;

public class Subset {
    int n;
    boolean[] check;

    public void solution(int n) {
        check = new boolean[n];
        this.n = n;
        check(0);
    }

    private void check(int i) {
        if (i == n) {
            printCheck();
            System.out.println();
            return;
        }
        check[i] = false;
        check(i + 1);
        check[i] = true;
        check(i + 1);
    }

    private void printCheck() {
        System.out.print("{");
        for (int i = 0; i < check.length; i++) {
            if (check[i]) {
                System.out.print(i + 1);
            } else {
                continue;
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        Subset subset = new Subset();
        int n = 4;
        subset.solution(n);
    }
}
