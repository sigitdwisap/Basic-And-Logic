package com.basicandlogic.nativesortalgorithm;

import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    private Main() {
        try {
            inputArray();
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }

    private void inputArray() {
        System.out.print("Array of Numbers: ");
        String[] arItems = input.nextLine().split(",");
        System.out.println();
        new NativeSearchAlgorithm(arItems);
    }

    public static void main(String[] args) {
        new Main();
    }
}
