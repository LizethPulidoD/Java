package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length > 0) {
            int[] tempArrayCopy;
            tempArrayCopy = Arrays.copyOf(array, array.length);
            array[0] = tempArrayCopy[array.length - 1];
            System.arraycopy(tempArrayCopy, 0, array, 1, array.length - 1);
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length > 0) {
            int[] tempArrayCopy;
            tempArrayCopy = Arrays.copyOf(array, array.length);
            System.arraycopy(tempArrayCopy, 0, array, shift, array.length - shift);
            System.arraycopy(tempArrayCopy, array.length - shift, array, 0, shift);
        }
    }
}
