package com.basicandlogic.reversewords;

public class ReverseWords {

    public ReverseWords(String words) {
        System.out.println();
        reverseWithTemporary(words);
        reverseWithoutTemporary(words);
        System.out.println();
    }

    private void reverseWithTemporary(String words) {
        String temp = "";
        for (int i = words.length(); i > 0; i--) {
            temp = temp + words.charAt(i-1);
        }
        System.out.println("Reverse with temp         : " + temp);
    }

    private void reverseWithoutTemporary(String words) {
        for (int i = 0; i < words.length(); i++) {
            words = words.substring(1, words.length() - i) + words.substring(0, 1) + words.substring(words.length() - i, words.length());
        }
        System.out.println("Reverse without temporary : " + words);
    }
}