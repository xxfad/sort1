package org.xxfad.sort.sort1;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * @author xxfad 2018/6/5
 */
public class CocktailSorterTest {

    @Test
    public void testSort() {

        MockConfig mockConfig = new MockConfig()
                .intRange(0, Integer.MAX_VALUE)
                .sizeRange(0, 1000);

        Integer[] data = JMockData.mock(Integer[].class, mockConfig);

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("After: ");
        new CocktailSorter(data).sort();
        System.out.println(Arrays.toString(data));
    }

    @Test
    public void testSort100() {
        for (int i = 1; i < 101; i++) {
            System.out.println("round " + i + ": ");

            testSort();

            System.out.println();
        }
    }

    @Test
    public void testBubbleWithCocktai() {
        MockConfig mockConfig = new MockConfig()
                .intRange(0, Integer.MAX_VALUE)
                .sizeRange(0, 1000);

        Integer[] data = JMockData.mock(Integer[].class, mockConfig);
        Integer[] clone = data.clone();

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("BubbleSort: ");
        new BubbleSorter(data).sort();
        System.out.println(Arrays.toString(data));

        System.out.println("CocktailSort: ");
        new CocktailSorter(clone).sort();
        System.out.println(Arrays.toString(clone));

        assertEquals(data, clone);
    }


    @Test
    public void testBubbleWithCocktai100() {
        for (int i = 1; i < 101; i++) {
            System.out.println("round " + i + ": ");

            testBubbleWithCocktai();

            System.out.println();
        }
    }
}