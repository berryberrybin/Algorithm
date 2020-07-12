package dfs;

public class Maze {
    int moveCount = 0;
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
        moveCount++;
        printMaze(i, j);
        if (i == map.length - 1 && j == map.length - 1) {
            find = true;
            System.out.println("찾았다.");
            System.out.println(moveCount);
            return;
        }
        if (j < map.length - 1 && map[i][j + 1] == 0 && !visited[i][j + 1] && !find) {
            solution(i, j + 1);
        }
        if (i < map.length - 1 && map[i + 1][j] == 0 && !visited[i + 1][j] && !find) {
            solution(i + 1, j);
        }
        if (i > 0 && map[i - 1][j] == 0 && !visited[i - 1][j] && !find) {
            solution(i - 1, j);
        }
        if (j > 0 && map[i][j - 1] == 0 && !visited[i][j - 1] && !find) {
            solution(i, j - 1);
        }
    }

    public void printMaze(int x, int y) {
        try {
            Thread.sleep(100);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i == x && j == y) {
                    System.out.print('★');
                } else if (map[i][j] == 0) {
                    System.out.print('□');
                } else {
                    System.out.print('■');
                }
            }
            System.out.println();
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
