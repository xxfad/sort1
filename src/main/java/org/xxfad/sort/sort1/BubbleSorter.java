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
                    swap(j, j + 1);
                }
            }
        }

    }

    private void swap(int j1, int j2) {
        Comparable temp = data[j2];
        data[j2] = data[j1];
        data[j1] = temp;
    }

}
