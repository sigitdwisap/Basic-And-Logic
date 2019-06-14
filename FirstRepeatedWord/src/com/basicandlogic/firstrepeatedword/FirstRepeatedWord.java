package com.basicandlogic.firstrepeatedword;

import java.util.HashSet;

class FirstRepeatedWord {

    FirstRepeatedWord(String[] words) {
        System.out.println(find(words));
    }

    private String find(String[] words){
        HashSet<String> hashString = new HashSet<>();
        for (String word : words) {
            if (hashString.contains(word)) {
                return "First repeated word: " + word;
            } else {
                hashString.add(word);
            }
        }

        return "No repeated word found!";
    }
}