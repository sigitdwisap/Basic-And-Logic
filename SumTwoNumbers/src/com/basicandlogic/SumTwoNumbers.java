package com.basicandlogic;

class SumTwoNumbers {

    SumTwoNumbers(int[] numbers, int sum) {
        int[] indices = findTwoSum(numbers, sum);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }

    private int[] findTwoSum(int[] list, int sum) {
        int[] result = new int[2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (j != i) {
                    if (list[i] + list[j] == sum) {
                        result[0] = list[i];
                        result[1] = list[j];
                    }
                }
            }
        }
        return result;
    }
}
