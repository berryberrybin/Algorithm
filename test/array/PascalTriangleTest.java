package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class PascalTriangleTest {
    PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    public void test1() {
        int[][] result = pascalTriangle.make(3);
        assertArrayEquals(result, new int[][]{{1}, {1, 1}, {1, 2, 1}});
    }

    @Test
    public void test2() {
        int[][] result = pascalTriangle.make(5);
        assertArrayEquals(result, new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}});
    }
}