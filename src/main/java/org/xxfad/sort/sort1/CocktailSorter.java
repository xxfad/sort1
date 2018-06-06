package org.xxfad.sort.sort1;

import org.jetbrains.annotations.NotNull;

/**
 * @author xxfad 2018/6/4
 */
public class CocktailSorter {

    private Comparable[] data;

    public CocktailSorter(@NotNull Comparable[] data) {
        this.data = data;
    }

    public void sort() {

        int left = 0;
        int right = data.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    ArraysUtils.swap(data, i, i + 1);
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (data[i].compareTo(data[i - 1]) < 0) {
                    ArraysUtils.swap(data, i, i - 1);
                }
            }

            left++;
        }

    }

}
