package bfs;

import java.util.LinkedList;

public class Maze {
    int moveCount = 0;
    int[][] map;
    boolean[][] visited;
    LinkedList<Integer[]> queue = new LinkedList<>();

    public Maze(int[][] map) {
        this.map = map;
        visited = new boolean[map.length][map.length];
    }

    public void solution(int i, int j) {
        visited[i][j] = true;
        printMaze(i, j);

        Integer[] startLocation = new Integer[]{i, j};
        queue.add(startLocation);

        while (!queue.isEmpty()) {
            Integer[] removeLocation = queue.remove();
            i = removeLocation[0];
            j = removeLocation[1];
            moveCount++;
            printMaze(i, j);
            visited[i][j] = true;
            if (i == map.length - 1 && j == map.length - 1) {
                System.out.println("찾았다.");
                System.out.println(moveCount);
                return;
            }
            if (j < map.length - 1 && map[i][j + 1] == 0 && !visited[i][j + 1] ) {
                queue.add(new Integer[]{i, j + 1});
            }
            if (i < map.length - 1 && map[i + 1][j] == 0 && !visited[i + 1][j] ) {
                queue.add(new Integer[]{i + 1, j});
            }
            if (i > 0 && map[i - 1][j] == 0 && !visited[i - 1][j]) {
                queue.add(new Integer[]{i - 1, j});
            }
            if (j > 0 && map[i][j - 1] == 0 && !visited[i][j - 1]) {
                queue.add(new Integer[]{i, j - 1});
            }
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
