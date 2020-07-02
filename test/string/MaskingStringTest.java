package string;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaskingStringTest {
    MaskingString maskingString = new MaskingString();

    @Test
    public void maskingTest1() {
        String s = "abcde";
        String result = maskingString.masking(s);
        assertEquals("*bcde", result);
    }

    @Test
    public void maskingTest2() {
        String s = "aAaAaAaA";
        String result = maskingString.masking(s);
        assertEquals("********", result);
    }

    @Test
    public void maskingTest3() {
        String s = "BCDEFG1234";
        String result = maskingString.masking(s);
        assertEquals("BCDEFG1234", result);
    }

    @Test
    public void maskingTest4() {
        String s = "aAbBcCdDeE";
        String result = maskingString.masking(s);
        assertEquals("**bBcCdDeE", result);
    }

    @Test
    public void maskingTest5() {
        String s = "";
        String result = maskingString.masking(s);
        assertEquals("", result);
    }
}