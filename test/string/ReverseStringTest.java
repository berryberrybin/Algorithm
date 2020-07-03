package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString reverseString = new ReverseString();

    @Test
    public void reverseTest1() {
        String s = "abcde";
        String result = reverseString.reverse(s);
        assertEquals("edcba", result);
    }

    @Test
    public void reverseTest2() {
        String s = "aAbBcCdDeE";
        String result = reverseString.reverse(s);
        assertEquals("EeDdCcBbAa", result);
    }

    @Test
    public void reverseTest3() {
        String s = "a1b2c3d4e5";
        String result = reverseString.reverse(s);
        assertEquals("5e4d3c2b1a", result);
    }

    @Test
    public void reverseTest4() {
        String s = "$#@!edcba";
        String result = reverseString.reverse(s);
        assertEquals("abcde!@#$", result);
    }

    @Test
    public void reverseTest5() {
        String s = "";
        String result = reverseString.reverse(s);
        assertEquals("", result);
    }
}