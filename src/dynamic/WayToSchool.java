package dynamic;

public class WayToSchool {
    public int solution(int m, int n, int[][] puddles) {
        long[][] way = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                way[i][j] = -1;
            }
        }
        way[0][0] = 1;
        for (int i = 0; i < puddles.length; i++) {
            way[(puddles[i][0]) - 1][(puddles[i][1]) - 1] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (way[i][0] != 0) {
                way[i][0] = 1;
            } else if (way[i][0] == 0){
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (way[0][i] != 0) {
                way[0][i] = 1;

            } else if(way[0][i] != 0){
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (way[i][j] == -1) {
                    way[i][j] = way[i][j - 1] % 1000000007 + way[i - 1][j] % 1000000007;
                    way[i][j] = way[i][j] % 1000000007;
                }
            }
        }
        long answer = way[n - 1][m - 1] % 1000000007;
        return (int) answer;
    }

    public static void main(String[] args) {
        WayToSchool waytoschool = new WayToSchool();
        int result = waytoschool.solution(2, 2, new int[][]{{2, 1}});
        System.out.println(result);
    }
}

