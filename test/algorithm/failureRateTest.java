package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class failureRateTest {
    @Test
    public void failureRateTest1() {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        failureRate failurerate = new failureRate();
        int[] result = failurerate.solution(N, stages);
        assertArrayEquals(new int[]{3, 4, 2, 1, 5}, result);
    }
}