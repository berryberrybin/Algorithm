package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeTest {
    Change change = new Change();

    @Test
    public void changeTest1() {
        int result = change.change(362);
        assertEquals(7, result);
    }

    @Test
    public void changeTest2() {
        int result = change.change(100);
        assertEquals(1, result);
    }

    @Test
    public void changeTest3() {
        int result = change.change(1000);
        assertEquals(10, result);
    }

    @Test
    public void changeTest4() {
        int result = change.change(1361);
        assertEquals(16, result);
    }

    @Test
    public void changeTest5() {
        int result = change.change(9999);
        assertEquals(109, result);
    }
}