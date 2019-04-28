package com.basicandlogic.maxdif;

class MaxDifference {

    MaxDifference(int[] number) {
        System.out.println("Max Difference : " + maxDif(number));
    }

    // compute max difference between any item and any lower indexed smaller item for all possible pairs
    private static int maxDif(int[] number) {
        int maxDiff = -1;
        int aLen = number.length;
        for (int i = 0; i < aLen; i++) {
            for (int j = 0; j < aLen; j++) {
                if (j != i) {
                    if (j > i) {
                        if (number[j] > number[i]) {
                            if (number[j] - number[i] > maxDiff) {
                                maxDiff = number[j] - number[i];
                            }
                        }
                    }
                }
            }
        }
        return maxDiff;
    }
}
