package com.basicandlogic.reversewords;

import java.util.Scanner;

public class MainClass {

    private static final Scanner input = new Scanner(System.in);

    private MainClass() {
        try {
            inputWord();
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }

    private void inputWord() {
        System.out.print("Input word : ");
        String words = input.nextLine();
        new ReverseWords(words);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}

