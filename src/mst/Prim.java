package mst;

public class Prim {
    private int[][] convertEdgesToCostArray(int[][] edges, int N) {
        int[][] result = new int[N][N];
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < 3; j++) {
                result[(edges[i][0]) - 1][(edges[i][1]) - 1] = edges[i][2];
                result[(edges[i][1]) - 1][(edges[i][0]) - 1] = edges[i][2];
            }
        }
        return result;
    }

    public int findMst(int[][] edges, int N) {
        int sumCost = 0;
        boolean[] vertex = new boolean[N];
        int[][] costArray = convertEdgesToCostArray(edges, N);
        vertex[0] = true;
        int min = Integer.MAX_VALUE;
        int nextVertex = 0;
        for (int i = 0; i < N; i++) {
            min = Integer.MAX_VALUE;
            for (int k = 0; k < N; k++) {
                if (!vertex[k]) {
                    continue;
                }
                for (int j = 0; j < costArray[k].length; j++) {
                    if (vertex[j]) {
                        continue;
                    }
                    if (costArray[k][j] != 0 && costArray[k][j] < min) {
                        min = costArray[k][j];
                        nextVertex = j;
                    }
                }
            }
            sumCost = sumCost + min;
            vertex[nextVertex] = true;
            boolean isDone = true;
            for (int m = 0; m < N; m++) {
                if (!vertex[m]) {
                    isDone = false;
                }
            }
            if (isDone) {
                break;
            }
        }

        // edges: [[start, end, cost], [start, end, cost]...]
        // Array

        return sumCost;
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
        int[][] result = prim.convertEdgesToCostArray(edges, 5);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        int answer = prim.findMst(edges, 5);
        System.out.println("합계 : " + answer);
    }
}
