package mst;

public class LinkedIslnad {

        public int solution(int n, int[][] costs) {
        int[][] sortedEdges = sortEdges(costs);
        int[] group = initializeGroup(n);
        int costSum = 0;
        int count = 0;
        for (int i = 0; i < sortedEdges.length; i++) {
            int startIndex = sortedEdges[i][0] ;
            int endIndex = sortedEdges[i][1] ;
            if (group[startIndex] == group[endIndex]) {
                continue;
            }
            costSum = costSum + sortedEdges[i][2];
            count++;
            if (count == n - 1) {
                break;
            }
            changeGroupValue(group, group[endIndex], group[startIndex]);
        }
        int answer = costSum;
        return answer;
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

}
//https://programmers.co.kr/learn/courses/30/lessons/42861