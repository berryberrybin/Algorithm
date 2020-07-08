package algorithm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthNumberTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNumber kthNumber = new KthNumber();
        int[] result = kthNumber.solution(array, commands);
        assertArrayEquals(new int[]{5, 6, 3}, result);
    }
}