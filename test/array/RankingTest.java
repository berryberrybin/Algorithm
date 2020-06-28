package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class RankingTest {
    Ranking ranking = new Ranking();

    @Test
    public void test1() {
        int[] result = ranking.rank(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(result, new int[]{5, 4, 3, 2, 1});
    }

    @Test
    public void test2() {
        int[] result = ranking.rank(new int[]{-1, 10, 3, 7, 5});
        assertArrayEquals(result, new int[]{5, 1, 4, 2, 3});
    }


    @Test
    public void test3() {
        int[] result = ranking.rank(new int[]{1, 10, 3, 7, 5, 2, 2, 6, 9, 8});
        assertArrayEquals(result, new int[]{10, 1, 7, 4, 6, 8, 8, 5, 2, 3});
    }
}