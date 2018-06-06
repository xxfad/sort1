package org.xxfad.sort.sort1;

import org.jetbrains.annotations.NotNull;

/**
 * @author xxfad 2018/6/4
 */
public class BubbleSorter {

    private Comparable[] data;

    public BubbleSorter(@NotNull Comparable[] data) {
        this.data = data;
    }

    public void sort() {

        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    ArraysUtils.swap(data, j, j + 1);
                }
            }
        }

    }

}
