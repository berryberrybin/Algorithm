package algorithm;

public class Coins {
    static int[] myCoinShow = {1, 1, 1, 1, 2, 5, 25, 25, 25};
    static int soManyCoinsShow = myCoinShow.length;
    static int[] toPay = {34, 102};

    static boolean sumSubsets(int set[], int n, int target) {
        int[] x = new int[set.length]; // 부분 집합을 저장할 배열
        int j = set.length - 1;
        while (n > 0) { // n이 0이 될 때까지 반복
            x[j] = n % 2; // 0 또는 1을 저장하며, 1은 배열의 해당 인덱스를 선택하겠다는 의미
            n = n / 2;
            j--;
        }
        int sum = 0; // 부분집합 합계
        for (int i = 0; i < set.length; i++) {
            if (x[i] == 1) { // 선택된 배열 인덱스만 합산
                sum = sum + set[i];
            }
        }

        if (sum == target) { // 만약 찾으려는 target과 합계가 같다면 정답 찾은 것
            for (int i = 0; i < set.length; i++) {
                if (x[i] == 1) {
                    System.out.print(set[i] + " ");
                }
            }
            System.out.println();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int pay : toPay) { // 계산해야 하는 값마다 반복
            boolean find = false;
            int x = (int) Math.pow(2, soManyCoinsShow); // 부분집합 최대 개수
            for (int i = x - 1; i >= 1; i--) {
                if (sumSubsets(myCoinShow, i, pay)) { // 부분집합 합이 pay와 같은 경우를 찾았을 때 종료
                    find = true;
                    break;
                }
            }
            if (!find) { // 못 찾았을 때 메시지 출력
                System.out.println("Not found");
            }
        }
    }
}
