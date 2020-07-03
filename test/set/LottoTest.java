package set;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LottoTest extends TestCase {
    @Test
    public void pickTest() {
        int n = 10;
        Lotto lotto = new Lotto();
        int[] array = lotto.pick();
        assertTrue("Wrong Lotto Number: " + Arrays.toString(array), isValid(array));
    }

    private boolean isValid(int[] array) {
        if (array.length != 6) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }
        if (set.size() != 6) {
            return false;
        }
        for (int item : set) {
            if (item < 1 || item > 45) {
                return false;
            }
        }
        return true;
    }
}