package com.basicandlogic.fizzbuzz;

import java.util.Scanner;

public class MainClass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("See result from 1 to ");
        int number = scanner.nextInt();
        System.out.println();
        new FizzBuzz(number);
    }
}

