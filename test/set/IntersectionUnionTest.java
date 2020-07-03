package set;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class IntersectionUnionTest {
    IntersectionUnion intersectionUnion = new IntersectionUnion();

    @Test
    public void intersectionTest1() {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        int[] result = intersectionUnion.intersection(a, b);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

    @Test
    public void intersectionTest2() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{1, 2, 3};
        int[] result = intersectionUnion.intersection(a, b);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

    @Test
    public void intersectionTest3() {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6};
        int[] result = intersectionUnion.intersection(a, b);
        assertArrayEquals(result, new int[]{});
    }

    @Test
    public void intersectionTest4() {
        int[] a = new int[]{-1, 1, 0};
        int[] b = new int[]{1, 2, 0, 2, 3};
        int[] result = intersectionUnion.intersection(a, b);
        assertArrayEquals(result, new int[]{0, 1});
    }

    @Test
    public void intersectionTest5() {
        int[] a = new int[]{};
        int[] b = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = intersectionUnion.intersection(a, b);
        assertArrayEquals(result, new int[]{});
    }

    @Test
    public void unionTest1() {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        int[] result = intersectionUnion.union(a, b);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

    @Test
    public void unionTest2() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{1, 2, 3};
        int[] result = intersectionUnion.union(a, b);
        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void unionTest3() {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6};
        int[] result = intersectionUnion.union(a, b);
        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void unionTest4() {
        int[] a = new int[]{-1, 1, 0};
        int[] b = new int[]{1, 2, 0, 2, 3};
        int[] result = intersectionUnion.union(a, b);
        assertArrayEquals(result, new int[]{-1, 0, 1, 2, 3});
    }

    @Test
    public void unionTest5() {
        int[] a = new int[]{};
        int[] b = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = intersectionUnion.union(a, b);
        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5, 6});
    }
}