package com.basicandlogic.matchingelementarray;

class MatchingElementOfArray {

    MatchingElementOfArray(String[] arItems) {
        int[] ar = createArrayOfInt(arItems);
        System.out.println("Matching elements : " + sockMerchant(ar));
    }

    private int[] createArrayOfInt(String[] arItems) {
        int[] result = new int[arItems.length];
        for (int i = 0; i < arItems.length; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            result[i] = arItem;
        }
        return result;
    }

    // Complete the sockMerchant function below.
    private int sockMerchant(int[] ar) {

        int result = 0;

        MergeSort mergeSort =  new MergeSort();

        mergeSort.sort(ar, 0, ar.length - 1);

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                result++;
                i++;
            }
        }

        return result;
    }

}
