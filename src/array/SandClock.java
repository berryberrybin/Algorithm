package array;

public class SandClock {
    public void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (n - i) * 2 - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        new SandClock().print(n);
    }
}
