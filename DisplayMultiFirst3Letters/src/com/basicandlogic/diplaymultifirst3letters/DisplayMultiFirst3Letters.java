package com.basicandlogic.diplaymultifirst3letters;

public class DisplayMultiFirst3Letters {

    DisplayMultiFirst3Letters(String word, int n) {
        System.out.println(displayMulti(word, n));
    }

    private String displayMulti(String word, int n) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        if (word.length() < 3) {
            for (int i = word.length(); i > 0; i--) {
                temp.append(word.charAt(i - 1));
            }
            for (int i = 0; i < n; i++) {
                result.append(temp);
            }
        } else {
            for (int i = 0; i < n; i++) {
                result.append(word, 0, 3);
            }
        }
        return result.toString();
    }
}
