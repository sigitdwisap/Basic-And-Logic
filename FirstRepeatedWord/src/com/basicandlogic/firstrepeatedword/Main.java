package com.basicandlogic.firstrepeatedword;

import java.util.Scanner;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    private Main() {
        try {
            String[] words = inputSentence();
            new FirstRepeatedWord(words);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String[] inputSentence() {
        System.out.print("Sentence: ");
        return input.nextLine().split("[\\s,:;\\-.]+");
    }

    public static void main(String[] args) {
        new Main();
    }
}
