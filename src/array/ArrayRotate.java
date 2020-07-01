package array;

public class ArrayRotate {
    public int[][] rotate(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[array[i].length - j - 1][i] = array[i][j];
            }
        }


        // 입력된 array를 반시계 방향으로 회전하여 반환한다.
        return result;
    }
}
