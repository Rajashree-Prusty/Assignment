package com.arr;


	
	import java.util.HashMap;
	public class JAVAB {

	    public static int romanToInteger(String romanNumeral) {
	        HashMap<Character, Integer> romanNumerals = new HashMap<>();
	        romanNumerals.put('I', 1);
	        romanNumerals.put('V', 5);
	        romanNumerals.put('X', 10);
	        romanNumerals.put('L', 50);
	        romanNumerals.put('C', 100);
	        romanNumerals.put('D', 500);
	        romanNumerals.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
	            int value = romanNumerals.get(romanNumeral.charAt(i));
	            if (value < prevValue) {
	                result -= value;
	            } else {
	                result += value;
	            }
	            prevValue = value;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String romanNumeral = "IX"; // Example Roman numeral
	        int integerResult = romanToInteger(romanNumeral);
	        System.out.println("The integer value is: " + integerResult);
	    }
	}



