package algorithm;

import java.util.HashSet;

public class Tiling {
    public int solution(int n) {
        int answer = 1;
        HashSet<String> tile1 = new HashSet<>();
        HashSet<String> tile2 = new HashSet<>();
        HashSet<String> tile3 = new HashSet<>();

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            tile1.add("a");
            tile2.add("aa");
            tile2.add("b");
            for (int i = 2; i < n; i++) {
                tile3=new HashSet<>();
                for (String tile : tile1) {
                    tile3.add(tile + "b");
                    tile3.add("b" + tile);
                }
                for (String tile : tile2) {
                    tile3.add(tile + "a");
                    tile3.add("a" + tile);
                }
                tile1 = tile2;
                tile2 = tile3;
            }
        }
        answer = tile3.size();
        return answer;
    }

    public static void main(String[] args) {
        Tiling tiling = new Tiling();
        int n = 5;
        int answer = tiling.solution(n);
        System.out.println(answer);
    }
}
https://programmers.co.kr/learn/courses/30/lessons/12900