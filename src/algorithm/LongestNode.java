package algorithm;

import java.util.Arrays;

public class LongestNode {
    int[][] distance;
    boolean[] check;
    int n;

    public int solution(int n, int[][] edge) {
        this.n = n;
        check = new boolean[n];
        int start = 0;
        distanceInformation(edge);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (distance[i][j] == 0) {
                    distance[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        check[start] = true;
        for (int count = 0; count < n; count++) {
            int k = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!check[i] && distance[start][i] < min) {
                    min = distance[start][i];
                    k = i;
                }
            }
            check[k] = true;
            for (int i = 0; i < n; i++) {
                if (!check[i] && distance[k][i] != Integer.MAX_VALUE) {
                    if (distance[start][i] > distance[start][k] + distance[k][i]) {
                        distance[start][i] = distance[start][k] + distance[k][i];
                    }
                }
            }
        }
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = distance[start][i];
        }
        Arrays.sort(answer);
        int count = 0;
        int longestNumber=0;
        for (int i = n - 1; i > 0; i--) {
            if (answer[i] != Integer.MAX_VALUE) {
                longestNumber = answer[i];
                break;
            }
        }
        for(int i=n-1;i>0;i--){
            if(answer[i]==longestNumber){
                count++;
            }
        }
        return count;
    }

    public int[][] distanceInformation(int[][] edge) {
        distance = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    distance[i][j] = Integer.MAX_VALUE;
                } else {
                    distance[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < edge.length; i++) {
            int start = (edge[i][0]) - 1;
            int end = (edge[i][1]) - 1;
            distance[start][end] = distance[end][start] = 1;
        }
        return distance;
    }


    public static void main(String[] args) {
        LongestNode longestnode = new LongestNode();
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n = 6;
        System.out.println(longestnode.solution(n, edge));
    }

}
// https://programmers.co.kr/learn/courses/30/lessons/49189