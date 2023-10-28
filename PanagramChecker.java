package com.arr;

public class PanagramChecker {
	
	public class PangramChecker {
	    public static boolean isPangram(String input) {
	        input = input.toLowerCase().replaceAll(" ", ""); // Convert to lowercase and remove spaces
	        boolean[] alphabet = new boolean[26]; // 26 letters in the English alphabet

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if ('a' <= c && c <= 'z') {
	                alphabet[c - 'a'] = true;
	            }
	        }

	        for (boolean letter : alphabet) {
	            if (!letter) {
	                return false; // If any letter is missing, it's not a pangram
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog"; // Example input
	        if (isPangram(input)) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.println("The input is not a pangram.");
	        }
	    }
	}


}
