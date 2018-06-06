package org.xxfad.sort.sort1;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;

/**
 * @author xxfad 2018/6/6
 */
public class MockData {

    public static Integer[] defaultRandomInts() {

        MockConfig mockConfig = new MockConfig()
                .intRange(0, Integer.MAX_VALUE)
                .sizeRange(0, 1000);

        return JMockData.mock(Integer[].class, mockConfig);

    }

}
