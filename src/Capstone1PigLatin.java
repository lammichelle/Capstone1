import java.util.Scanner;

public class Capstone1PigLatin {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to the Pig Latin Translator!");

		String answer;
		int i = 0;

		do {
			System.out.println("Enter a line to be translated: ");

			String userInput = scnr.nextLine();
			String sentence = userInput.toLowerCase(); // changing the user input to all lower case
			char firstLetter = sentence.charAt(0);
			String vowels = "aeiou"; // combining all my vowels in a string for comparison later

			int totalLength = sentence.length(); // finding the length of the input

			// totallength has to be minus 1 because we are looking for index
			for (i = 0; i <= totalLength - 1; ++i) {
				if (vowels.contains("" + sentence.charAt(i))) {
					// the contain method must be a string
					String firstSubstring = sentence.substring(i, totalLength);
					// break off from the index of vowel
					String secondSubstring = sentence.substring(0, i);
					// from begining to vowel, since the end is exclusive, does not need to worry
					// about minus 1
					System.out.println(firstSubstring + secondSubstring + "ay");
					break; // if no break, it will continue print out indexes of all vowel
				} else if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
						|| firstLetter == 'u') {
					System.out.print(sentence + "way");
				}

			}

			System.out.println("Again?(yes/no)"); // loops around
			answer = scnr.next();
			if (answer.equalsIgnoreCase("no")) {
				System.out.println("Goodbye!");
			}
		} while (answer.equalsIgnoreCase("yes"));

	}
}