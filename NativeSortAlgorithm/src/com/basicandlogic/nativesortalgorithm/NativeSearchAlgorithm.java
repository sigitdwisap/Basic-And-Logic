package com.basicandlogic.nativesortalgorithm;

import java.util.Arrays;

class NativeSearchAlgorithm {

    NativeSearchAlgorithm(String[] arItems) {
        int[] ar = createArrayOfInt(arItems);

        //Bubble Sort
        int i = 0, n = ar.length;
        boolean swapNeeded = true;
        while (i < n - 1 && swapNeeded) {
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j - 1];
                    ar[j - 1] = ar[j];
                    ar[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }

        System.out.print(Arrays.toString(ar));
    }

    private int[] createArrayOfInt(String[] arItems) {
        int[] result = new int[arItems.length];
        for (int i = 0; i < arItems.length; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            result[i] = arItem;
        }
        return result;
    }
}