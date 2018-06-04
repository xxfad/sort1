package org.xxfad.sort.sort1;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author xxfad 2018/6/4
 */
public class BubbleSorterTest {

    @Test
    public void testSort() {

        MockConfig mockConfig = new MockConfig()
                .intRange(0, Integer.MAX_VALUE)
                .sizeRange(0, 1000);

        Integer[] data = JMockData.mock(Integer[].class, mockConfig);

        System.out.println("Before: ");
        System.out.println(Arrays.toString(data));

        System.out.println("After: ");
        new BubbleSorter(data).sort();
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

}