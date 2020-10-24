package mst;

public class Kruskal {
    public int findMst(int[][] edges, int N) {
        int[][] sortedEdges = sortEdges(edges);
        int[] group = initializeGroup(N);
        int costSum = 0;
        int count = 0;
        for (int i = 0; i < sortedEdges.length; i++) {
            int startIndex = sortedEdges[i][0] - 1;
            int endIndex = sortedEdges[i][1] - 1;
            if (group[startIndex] == group[endIndex]) {
                continue;
            }
            costSum = costSum + sortedEdges[i][2];
            count++;
            if (count == N - 1) {
                break;
            }
            changeGroupValue(group, group[endIndex], group[startIndex]);
        }
        return costSum;
    }

    public int[][] sortEdges(int[][] edges) {
        int[][] sortedEdges = new int[edges.length][3];
        for (int i = 0; i < edges.length; i++) {
            int minCost = Integer.MAX_VALUE;
            int minCostLocation = 0;
            for (int j = 0; j < edges.length; j++) {
                if (edges[j][2] != 0 && minCost >= edges[j][2]) {
                    minCost = edges[j][2];
                    minCostLocation = j;
                }
            }
            sortedEdges[i][0] = edges[minCostLocation][0];
            sortedEdges[i][1] = edges[minCostLocation][1];
            sortedEdges[i][2] = edges[minCostLocation][2];

            edges[minCostLocation][2] = 0;
        }
        return sortedEdges;
    }

    public int[] initializeGroup(int N) {
        int[] group = new int[N];
        for (int i = 0; i < N; i++) {
            group[i] = i;
        }
        return group;
    }

    public void changeGroupValue(int[] group, int source, int target) {
        for (int j = 0; j < group.length; j++) {
            if (group[j] == source) {
                group[j] = target;
            }
        }
    }


    public static void main(String[] args) {
        Kruskal kruskal = new Kruskal();
        int N = 5;
        int[][] edges = new int[][]{
                {0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}
        };
        int answer = kruskal.findMst(edges, N);
        System.out.println("합계 : " + answer);
    }
}

