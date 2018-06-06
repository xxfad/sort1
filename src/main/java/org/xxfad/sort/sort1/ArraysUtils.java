package org.xxfad.sort.sort1;

/**
 * @author xxfad 2018/6/6
 */
public class ArraysUtils {

    /**
     * Swaps x[a] with x[b].
     */
    public static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
