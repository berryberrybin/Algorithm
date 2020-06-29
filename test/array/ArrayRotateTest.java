package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRotateTest {
    ArrayRotate arrayRotate = new ArrayRotate();

    @Test
    public void rotate1() {
        int[][] array = new int[][]{{1}};
        int[][] result = arrayRotate.rotate(array);
        assertArrayEquals(new int[][]{{1}}, result);
    }

    @Test
    public void rotate2() {
        int[][] array = new int[][]{{1, 2}};
        int[][] result = arrayRotate.rotate(array);
        assertArrayEquals(new int[][]{{2}, {1}}, result);
    }

    @Test
    public void rotate3() {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = arrayRotate.rotate(array);
        assertArrayEquals(new int[][]{{3, 6, 9}, {2, 5, 8}, {1, 4, 7}}, result);
    }

    @Test
    public void rotate() {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] result = arrayRotate.rotate(array);
        assertArrayEquals(new int[][]{{3, 6, 9, 10}, {2, 5, 8, 11}, {1, 4, 7, 12}}, result);
    }
}