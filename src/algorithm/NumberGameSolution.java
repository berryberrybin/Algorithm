package algorithm;

import java.util.Arrays;

public class NumberGameSolution {
    public int solution(int[] A, int[] B) {
        int count = 0;
        int[] sortA = new int[A.length];
        int[] sortB = new int[B.length];

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=A.length-1;i>=0;i--){
            sortA[(A.length-1)-i] = A[i];
        }
        for(int i=B.length-1;i>=0;i--){
            sortB[B.length-1-i] = B[i];
        }

        int Location = 0;
        for(int i=0;i<sortB.length;i++){
            if(Location==sortA.length+1){
                break;
            }
            for(int j = Location;j<sortA.length;j++){
                if(sortB[i]>sortA[j]){
                    Location=j+1;
                    count++;
                    break;
                }
            }
        }

        return count;

    }
    public static void main(String[] args) {
        NumberGameSolution numbergamesolution = new NumberGameSolution();
        int[] A = {2,2,2,2};
        int[] B = {1,1,1,1};
        System.out.println(numbergamesolution.solution(A, B));
    }

}
//https://programmers.co.kr/learn/courses/30/lessons/12987