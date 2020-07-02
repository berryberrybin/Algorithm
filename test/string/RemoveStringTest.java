package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveStringTest {
    RemoveString removeString = new RemoveString();

    @Test
    public void removeTest1() {
        String s = "abcde";
        String result = removeString.remove(s);
        assertEquals("bcd", s);
    }

    @Test
    public void removeTest2() {
        String s = "ab";
        String result = removeString.remove(s);
        assertEquals("", s);
    }

    @Test
    public void removeTest3() {
        String s = "12345";
        String result = removeString.remove(s);
        assertEquals("234", s);
    }

    @Test
    public void removeTest4() {
        String s = "a1b2c3d4e5";
        String result = removeString.remove(s);
        assertEquals("1b2c3d4e", s);
    }

    @Test
    public void removeTest5() {
        String s = "aAbBcCdDeE";
        String result = removeString.remove(s);
        assertEquals("AbBcCdDe", s);
    }
}