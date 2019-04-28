package com.basicandlogic.numberstowords.All;

public class Main {
	public static void main(String[] args){
		for (int i = -100; i <= 100; i++) {
			System.out.println(SpelledOut.spelledInWords(i));
		}
	}
}
