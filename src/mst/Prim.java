package mst;

import java.util.HashSet;
import java.util.Set;

public class Prim {

    public int findMst(int[][] edges, int N) {
        // edges: [[start, end, cost], [start, end, cost]...]
        int sumCost = 0;
        Set<Integer> visited = new HashSet<>();
        int[][] costArray = convertEdgesToCostArray(edges, N);
        visited.add(0);
        while (visited.size() < N) {
            int nextVertex = 0;
            int min = Integer.MAX_VALUE;
            for (int k : visited) {
                for (int j = 0; j < costArray[k].length; j++) {
                    if (!visited.contains(j) && costArray[k][j] != 0 && costArray[k][j] < min) {
                        min = costArray[k][j];
                        nextVertex = j;
                    }
                }
            }
            sumCost = sumCost + min;
            visited.add(nextVertex);
        }
        return sumCost;
    }

    private int[][] convertEdgesToCostArray(int[][] edges, int N) {
        int[][] result = new int[N][N];
        for (int[] edge : edges) {
            result[(edge[0]) - 1][(edge[1]) - 1] = edge[2];
            result[(edge[1]) - 1][(edge[0]) - 1] = edge[2];
        }
        return result;
    }

    public static void main(String[] args) {
        Prim prim = new Prim();
        int N = 5;
        int[][] edges = new int[][]{
                {1, 2, 4},
                {1, 5, 3},
                {2, 3, 5},
                {2, 5, 2},
                {3, 4, 4},
                {3, 5, 7},
                {4, 5, 8}
        };
        int[][] result = prim.convertEdgesToCostArray(edges, N);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        int answer = prim.findMst(edges, N);
        System.out.println("합계 : " + answer);
    }
}
