package dfs;

public class Maze {
    int[][] map;
    boolean[][] visited;
    boolean find;

    public Maze(int[][] map) {
        this.map = map;
        visited = new boolean[map.length][map.length];
    }

    public void solution(int i, int j) {
        // 시작점: (0, 0)
        // 종료점: (n-1, n-1)
        visited[i][j] = true;
        System.out.println("( " + i + " , " + j + " )");
        if(i==map.length-1&&j==map.length-1){
            find=true;
            System.out.println("찾았다.");
            return;
        }
        if (j < map.length - 1 && map[i][j + 1] == 0 && visited[i][j+1] == false&&find==false) {
            solution(i, j + 1);
        }
        if (i < map.length - 1 && map[i + 1][j] == 0 && visited[i+1][j] == false&&find==false) {
            solution(i + 1, j);
        }
        if (i > 0 && map[i - 1][j] == 0 && visited[i-1][j] == false&&find==false) {
            solution(i - 1, j);
        }
        if (j > 0 && map[i][j - 1] == 0 && visited[i][j-1] == false&&find==false) {
            solution(i, j - 1);
        }
    }

    public static void main(String[] args) {
        int[][] map = {
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1, 0, 0},
        };
        new Maze(map).solution(0, 0);
    }
}
