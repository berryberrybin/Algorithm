package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertToBinaryTest {
    ConvertToBinary convertToBinary = new ConvertToBinary();

    @Test
    public void convertTest1() {
        int[] result = convertToBinary.convert(1);
        assertArrayEquals(result, new int[]{1});
    }

    @Test
    public void convertTest2() {
        int[] result = convertToBinary.convert(3);
        assertArrayEquals(result, new int[]{1, 1});
    }

    @Test
    public void convertTest3() {
        int[] result = convertToBinary.convert(4);
        assertArrayEquals(result, new int[]{1, 0, 0});
    }

    @Test
    public void convertTest4() {
        int[] result = convertToBinary.convert(10);
        assertArrayEquals(result, new int[]{1, 0, 1, 0});
    }

    @Test
    public void convertTest5() {
        int[] result = convertToBinary.convert(100);
        assertArrayEquals(result, new int[]{1, 1, 0, 0, 1, 0, 0});
    }
}