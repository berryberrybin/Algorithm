package array;

import java.util.ArrayList;

public class SecretMap {
    public int Binary(int n) {
        int nextNumber;
        int remainder;
        ArrayList<Integer> remainders = new ArrayList<Integer>();
        while (true) {
            remainder = n % 2;
            nextNumber = n / 2;
            remainders.add(remainder);
            n = nextNumber;
            if (n == 0) {
                break;
            }
        }
        int[] result = new int[remainders.size()];
        int size = remainders.size();
        for (int i = 0; i < size; i++) {
            result[i] = remainders.get(size - i - 1);
        }

        String resultString = "";
        for (int i = 0; i < result.length; i++) {
            resultString = resultString + result[i];
        }
        int resultInt = Integer.parseInt(resultString);
        return resultInt;
    }


    public String[] solve(int[] map1, int[] map2) {

        int map1Number;
        int map2Number;
        int sumNumber;
        String sumString;
        String[] result = new String[map1.length];
        SecretMap test = new SecretMap();
        for (int i = 0;i < map1.length; i++) {
            map1Number = test.Binary(map1[i]);
            map2Number = test.Binary(map2[i]);
            sumNumber = map1Number + map2Number;
            sumString = Integer.toString(sumNumber);
            sumString = sumString.replace('0', ' ');
            sumString = sumString.replace('1', '#');
            sumString = sumString.replace('2', '#');
            result[i] = sumString;
        }
        return result;
    }
}




        /*int max = 0;
        for (int i = 0; i < map1.length; i++) {
            if (max < map1[i]) {
                max = map1[i];
            }
        }
        for (int i = 0; i < map2.length; i++) {
            if (max < map2[i]) {
                max = map2[i];
            }
        } // map1과 map2 중에 큰 수 찾기
        int mapSize = 0;
        while (true) {
            max = max / 2;
            mapSize++;
            if (max == 0) {
                break;
            }
        } // 가장큰수를 2진수로 변환했을때 자리수가 mapsize.


        int[][] solutionMap1 = new int[map1.length][map1.length];
        int nextNumber;
        for (int i = 0; i < map1.length; i++) {
            solutionMap1[i][map1.length - i - 1] = map1[i] % 2;
            nextNumber = map1[i] / 2;
            map1[i] = nextNumber;
        }// map1을 돌면서 10진수를 2진수로 바꿔 solutionmap1 이중배열에 넣기
        int[][] solutionMap2 = new int[map2.length][map2.length];
        int nextNumber2;
        for (int i = 0; i < map2.length; i++) {
            solutionMap2[i][map2.length - i - 1] = map2[i] % 2;
            nextNumber = map2[i] / 2;
            map2[i] = nextNumber;
        }// map2를 돌면서 10진수를 2진수로 바꿔 solutionmap2 이중배열에 넣기
        for (int i = 0; i < solutionMap1.length; i++) {
            for (int j = 0; j < solutionMap1.length; j++) {
                if (solutionMap1[i][j] == 1) {
                    continue;
                } else {
                    solutionMap1[i][j] = 0;
                }
            }
        } // solutionMap1에 0이 들어가 있지 않은 곳에 0 넣기

        for (int i = 0; i < solutionMap2.length; i++) {
            for (int j = 0; j < solutionMap2.length; j++) {
                if (solutionMap2[i][j] == 1) {
                    continue;
                } else {
                    solutionMap2[i][j] = 0;
                }
            }
        }// solutionMap2에 0이 들어가 있지 않은 곳에 0 넣기

        String[][] result = new String[map1.length][map1.length];
        for (int i = 0; i < solutionMap1.length; i++) {
            for (int j = 0; j < solutionMap1.length; j++) {
                if (solutionMap1[i][j] == 0 && solutionMap2[i][j] == 0) {
                    result[i][j] = " ";
                } else {
                    result[i][j] = "#";
                }
            }
        }// solution1 과 solution2 합치면서 둘다 0일때만 " " 넣기
        String A = "";
        String[] resultAnswer = new String[map1.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                A = A + result[i][j];
            }
            resultAnswer[i] = A;
            A = "";
        }


        /*
        입력된 지도  1과 지도 2를 이용해 전체 지도를 찾는 문제이다.
        지도 1과 지도 2는 가로, 세로 길이가 n이며 0과 1로 이루어져 있는 정사각형 지도이다.
        지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
        암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화 했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
        즉, map1[0]이 9 일 때 2진수로 변환하면 01001이 된다.
        전체 지도는 지도 1과 지도 2를 겹쳐 모두 0인 경우만 전체 지도에서 공백이고, 지도 1과 지도 2 중 하나라도 1(벽)이 있는 경우 벽이다.
        반환하는 값은 전체 지도이며 벽은 #으로 표현하고 공백은 ' '으로 표현한 String 배열을 반환한다.
         */
