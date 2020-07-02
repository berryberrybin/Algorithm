package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void reverseTest1() {
        String s = "abcde";
        String result = reverseString.reverse(s);
        assertEquals("edcba", s);
    }

    @Test
    public void reverseTest2() {
        String s = "aAbBcCdDeE";
        String result = reverseString.reverse(s);
        assertEquals("EeDdCcBbAa", s);
    }

    @Test
    public void reverseTest3() {
        String s = "a1b2c3d4e5";
        String result = reverseString.reverse(s);
        assertEquals("5e4d3c2b1a", s);
    }

    @Test
    public void reverseTest4() {
        String s = "$#@!edbca";
        String result = reverseString.reverse(s);
        assertEquals("abcde!@#$", s);
    }

    @Test
    public void reverseTest5() {
        String s = "";
        String result = reverseString.reverse(s);
        assertEquals("", s);
    }
}