package com.basicandlogic.fizzbuzz;

class FizzBuzz {

    FizzBuzz(int inputNumber) {
        fizzBuzz(inputNumber);
    }

    private void fizzBuzz(int number){
        for(int i = 1; i <= number; i++) {
            if (i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }  else {
                System.out.println(i);
            }
        }
    }
}
