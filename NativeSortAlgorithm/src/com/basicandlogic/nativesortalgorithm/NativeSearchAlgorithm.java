package com.basicandlogic.nativesortalgorithm;

class NativeSearchAlgorithm {

    NativeSearchAlgorithm(String[] arItems) {
        int[] ar = createArrayOfInt(arItems);
        int[] sortedArray = new int[ar.length];

        for (int left = 0; left < ar.length; left++) {
            int greaterIndex = 0;
            for (int right = 0; right < ar.length; right++) {
                if (ar[left] > ar[right]) {
                    greaterIndex++;
                }
            }
            while (sortedArray[greaterIndex] == ar[left]) {
                greaterIndex++;
            }
            sortedArray[greaterIndex] = ar[left];
        }


        for (int a : sortedArray) {
            System.out.print(a + " ");
        }
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
