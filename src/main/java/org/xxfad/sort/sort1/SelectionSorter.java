package org.xxfad.sort.sort1;

import org.jetbrains.annotations.NotNull;

/**
 * @author xxfad 2018/6/6
 */
public class SelectionSorter {

    private Comparable[] data;

    public SelectionSorter(@NotNull Comparable[] data) {
        this.data = data;
    }

    public void sort() {

        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            ArraysUtils.swap(data, min, i);
        }

    }

}
