package com.RizzoTommaso;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length == 0 && b.length == 0) return true;
        if (a.length == 0 || b.length == 0) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = a[i] * -1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                b[i] = b[i] * -1;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if (!(b[i] == (int) Math.pow(a[i], 2))) {
                return false;
            }
        }
        return true;
    }
}
