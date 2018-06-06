package org.xxfad.sort.sort1;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * @author xxfad 2018/6/6
 */
public class InsertionSorterTest {

    @Test
    public void testSort() {

        Integer[] data = MockData.defaultRandomInts();

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("After: ");
        new InsertionSorter(data).sort();
        System.out.println(Arrays.toString(data));

    }

    @Test
    public void testSortCheckByBubble() {

        Integer[] data = MockData.defaultRandomInts();
        Integer[] clone = data.clone();

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("BubbleSort: ");
        new BubbleSorter(data).sort();
        System.out.println(Arrays.toString(data));

        System.out.println("MySort: ");
        new InsertionSorter(clone).sort();
        System.out.println(Arrays.toString(clone));

        assertEquals(data, clone);
    }


    @Test
    public void test100SortCheckByBubble() {
        for (int i = 1; i < 101; i++) {
            System.out.println("round " + i + ": ");

            testSortCheckByBubble();

            System.out.println();
        }
    }

    @Test
    public void testSortDichotomy() {

        Integer[] data = MockData.defaultRandomInts();

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("After: ");
        new InsertionSorter(data).sortDichotomy();
        System.out.println(Arrays.toString(data));

    }

    @Test
    public void testSortDichotomyCheckByBubble() {

        Integer[] data = MockData.defaultRandomInts();
        Integer[] clone = data.clone();

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("BubbleSort: ");
        new BubbleSorter(data).sort();
        System.out.println(Arrays.toString(data));

        System.out.println("MySort: ");
        new InsertionSorter(clone).sortDichotomy();
        System.out.println(Arrays.toString(clone));

        assertEquals(data, clone);
    }


    @Test
    public void test100SortDichotomyCheckByBubble() {
        for (int i = 1; i < 101; i++) {
            System.out.println("round " + i + ": ");

            testSortCheckByBubble();

            System.out.println();
        }
    }
}