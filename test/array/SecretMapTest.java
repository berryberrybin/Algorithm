package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecretMapTest {
    SecretMap secretMap = new SecretMap();

    @Test
    public void solveTest1() {
        int[] map1 = new int[]{9, 20, 28, 18, 11};
        int[] map2 = new int[]{30, 1, 21, 17, 28};
        String[] result = secretMap.solve(map1, map2);
        /*
        #####
        # # #
        ### #
        #  ##
        #####
         */
        assertArrayEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"}, result);
    }

    @Test
    public void solveTest2() {
        int[] map1 = new int[]{46, 33, 33, 22, 31, 50};
        int[] map2 = new int[]{27, 56, 19, 14, 14, 10};
        String[] result = secretMap.solve(map1, map2);
        /*
        ######
        ###  #
        ##  ##
         ####
         #####
        ### #
         */
        assertArrayEquals(new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "}, result);
    }
}