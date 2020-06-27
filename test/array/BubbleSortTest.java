package array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class BubbleSortTest {

    @Test
    public void sortTest1(){
        int[] array = {1, 2, 3};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(array);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

    @Test
    public void sortTest2(){
        int[] array = {3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(array);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

    @Test
    public void sortTest3(){
        int[] array = {1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(array);
        assertArrayEquals(result, new int[]{1});
    }

    @Test
    public void sortTest4(){
        int[] array = {1, 5, 3, 3, 2, 7, 8, 9, 10, 2};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(array);
        assertArrayEquals(result, new int[]{1, 2, 2, 3, 3, 5, 7, 8, 9, 10});
    }
}