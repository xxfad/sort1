package org.xxfad.sort.sort1;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author xxfad 2018/6/4
 */
public class BubbleSorterTest {

    @Test
    public void testSort() {

        Integer[] data = MockData.defaultRandomInts();

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("After: ");
        new BubbleSorter(data).sort();
        System.out.println(Arrays.toString(data));
    }

    @Test
    public void test100Sort() {
        for (int i = 1; i < 101; i++) {
            System.out.println("round " + i + ": ");

            testSort();

            System.out.println();
        }
    }

}