package org.xxfad.sort.sort1;

import org.jetbrains.annotations.NotNull;

/**
 * @author xxfad 2018/6/6
 */
public class InsertionSorter {

    private Comparable[] data;

    public InsertionSorter(@NotNull Comparable[] data) {
        this.data = data;
    }

    public void sort() {

        for (int i = 1; i < data.length; i++) {
            Comparable get = data[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (get.compareTo(data[j]) < 0) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = get;
        }

    }

    public void sortDichotomy() {
        for (int i = 1; i < data.length; i++) {
            Comparable get = data[i];
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (get.compareTo(data[mid]) < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            int j = i;
            for (; j > left; j--) {
                data[j] = data[j - 1];
            }
            data[left] = get;
        }
    }

}
