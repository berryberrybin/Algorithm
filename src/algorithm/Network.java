package algorithm;

import java.util.Arrays;

public class Network {
    public int[] initializeConnectionResult(int n) {
        int[] connectionResult = new int[n];
        for (int i = 0; i < n; i++) {
            connectionResult[i] = i;
        }
        return connectionResult;
    }

    public int[] existNetwork(int[] connectionResult, int checkNumber, int changeNumber) {
        for (int i = 0; i < connectionResult.length; i++) {
            if (connectionResult[i] == checkNumber) {
                connectionResult[i] = changeNumber;
            }
        }
        return connectionResult;
    }

    public int differentNumberCount(int[] connectionResult) {
        int count = 1;
        Arrays.sort(connectionResult);
        for (int i = 0; i < connectionResult.length - 1; i++) {
            if (connectionResult[i] != connectionResult[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public int solution(int n, int[][] computers) {
        int[] connectionResult = initializeConnectionResult(n);

        for(int start = 0;start<n;start++) {
            for (int i = 0; i < n; i++) {
                if (start < i && computers[start][i] != 0) {
                    connectionResult = existNetwork(connectionResult, connectionResult[i], connectionResult[start]);
                }
            }
        }
        int answer = differentNumberCount(connectionResult);

        return answer;
    }

    public static void main(String[] args) {
        Network network = new Network();
        int n = 4;
        int[][] computers = {{1, 0, 0, 1}, {0, 1, 1, 1}, {0, 1, 1, 0}, {1, 1, 0, 1}};
        int answer = network.solution(n, computers);
        System.out.println(answer);
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/43162