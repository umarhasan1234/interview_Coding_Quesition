package test;

public class ReverseWords {
	    public static void main(String[] args) {
	        String input = "hello, this is";
	        String output = reverseWords(input);
	        System.out.println(output);
	    }

	    public static String reverseWords(String input) {
	        StringBuilder result = new StringBuilder();
	        String[] words = input.split("\\s+");

	        for (String word : words) {
	            String reversedWord = new StringBuilder(word).reverse().toString();
	            result.append(reversedWord).append(" ");
	        }

	        return result.toString().trim();
	    }
	}

