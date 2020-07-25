package shortest_path;

public class Dijkstra {
    public int[] shortestPath(int map[][], int start) {
        int n = map.length;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        check[start] = true;
        for (int count = 0; count < n; count++) {
            int k = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (!check[i] && map[start][i] < min) {
                    min = map[start][i];
                    k = i;
                }
            }
            check[k] = true;
            for (int i = 0; i < n; i++) {
                if (!check[i] && map[k][i] != Integer.MAX_VALUE) {
                    if (map[start][i] > map[start][k] + map[k][i]) {
                        map[start][i] = map[start][k] + map[k][i];
                    }
                }
            }
        }
        return map[start];
    }

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();
        int start = 0;
        int[][] test = new int[][]{
                {0, 3, 0, 0, 0},
                {0, 0, 0, 1, 4},
                {0, 0, 0, 1, 0},
                {3, 6, 2, 0, 2},
                {0, 0, 0, 0, 0}
        };
        int[] answer = dijkstra.shortestPath(test, start);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}


