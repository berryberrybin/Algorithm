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
            way[(puddles[i][1]) - 1][(puddles[i][0]) - 1] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (way[i][0] == 0) {
                for (int k = i; k < n; k++) {
                    way[k][0] = 0;
                }
                break;
            } else {
                way[i][0] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            if (way[0][i] == 0) {
                for (int k = i; k < m; k++) {
                    way[0][k] = 0;
                }
                break;
            } else {
                way[0][i] = 1;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (way[i][j] == -1) {
                    way[i][j] = way[i][j - 1] + way[i - 1][j];
                    way[i][j] = way[i][j] % 1000000007;
                }
            }
        }
        long answer = way[n - 1][m - 1];
        return (int) answer;
    }

    public static void main(String[] args) {
        WayToSchool waytoschool = new WayToSchool();
        int result = waytoschool.solution(3, 4, new int[][]{{1, 2}, {2, 4}});
        System.out.println(result);
    }
}

//https://programmers.co.kr/learn/courses/30/lessons/42898