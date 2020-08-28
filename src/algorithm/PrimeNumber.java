package algorithm;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {

    final static int MINIMUM = 3;
    final static int MAXIMUM = 70000000;

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // 0, 1은 소수가 아니기 때문에 false
        }
        for (int index = 2; index <= Math.sqrt(n); index++) {
            if (n % index == 0)
                return false; // 소수가 아닐 경우 false
        }
        return true; //소수일 경우 true
    }

    public static void main(String[] args) {
        Set<Integer> primeSet = new HashSet<>();
        for (int index = MINIMUM; index <= MAXIMUM; index++) {
            int copiedIndex = index;
            while (copiedIndex != 0) { // 모든 숫자를 소수 체크할 때까지 반복
                if(!primeSet.contains(copiedIndex) && !isPrime(copiedIndex)){ // 소수가 아닌 경우 종료
                    break;
                }
                primeSet.add(copiedIndex); // 소수를 찾았을 때는 primeSet에 저장
                copiedIndex /= 10; // 마지막 숫자 제거
            }
            if (copiedIndex == 0) { // 모든 숫자가 소수일 때 출력
                System.out.print(index + " ");
            }
        }
    }
}


