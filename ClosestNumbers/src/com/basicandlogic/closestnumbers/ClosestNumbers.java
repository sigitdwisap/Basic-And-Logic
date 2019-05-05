package com.basicandlogic.closestnumbers;

class ClosestNumbers {

    ClosestNumbers(int[] numbers) {
        System.out.println(distClosestNumbers(numbers));
    }

    // Returns the distance between the two closest numbers.
    private int distClosestNumbers(int[] numbers) {
        int closestDistance = 0;
        if (numbers.length > 1) {
            closestDistance = Math.abs(numbers[1] - numbers[0]);
        }
        int numLen = numbers.length;
        for (int i = 0; i < numLen; i++) {
            for (int j = i + 1; j < numLen; j++) {
                if (Math.abs(numbers[j] - numbers[i]) < closestDistance) {
                    closestDistance = Math.abs(numbers[j] - numbers[i]);
                }
            }
        }
        return closestDistance;
    }
}
