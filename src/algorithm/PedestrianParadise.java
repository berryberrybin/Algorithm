package algorithm;

public class PedestrianParadise {
    int MOD = 20170805;

    public int solution(int m, int n, int[][] cityMap) {
        int[][] numberOfCase = new int[m][n];

        for (int i = 0; i < n; i++) {
            if (cityMap[0][i] == 1) {
                break;
            }
            numberOfCase[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            if (cityMap[i][0] == 1) {
                break;
            }
            numberOfCase[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (cityMap[i][j] == 1) {
                    continue;
                }
                int iReplace = i - 1;
                int jReplace = j - 1;
                while (jReplace >= 0 && cityMap[i][jReplace] == 2){
                    jReplace--;
                };
                while (iReplace >= 0 && cityMap[iReplace][j] == 2){
                    iReplace--;
                };
                int left = (jReplace < 0) ? 0 : numberOfCase[i][jReplace];
                int up = (iReplace < 0) ? 0 : numberOfCase[iReplace][j];
                numberOfCase[i][j] = (left % MOD + up % MOD) % MOD;
            }
        }

        int answer = numberOfCase[m - 1][n - 1];
        return answer;
    }

    public static void main(String[] args) {
        PedestrianParadise pedestrianparadise = new PedestrianParadise();
        int m = 3;
        int n = 3;
        int[][] cityMap = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cityMap[i][j] = 0;
            }
        }
        System.out.println(pedestrianparadise.solution(m, n, cityMap));
    }
}
//https://programmers.co.kr/learn/courses/30/lessons/1832