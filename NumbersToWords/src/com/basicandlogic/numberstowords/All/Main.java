package com.basicandlogic.numberstowords.All;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("With condition (y/n)? : ");
        String con = scanner.next();
        if (con.equalsIgnoreCase("y")) {
            for (int i = -100; i <= 100; i++) {
                System.out.println(SpelledOut.spelledInWordsWithCondition(true, i));
            }
        } else {
            for (int i = -100; i <= 100; i++) {
                System.out.println(SpelledOut.spelledInWordsWithCondition(false, i));
            }
        }
    }
}
