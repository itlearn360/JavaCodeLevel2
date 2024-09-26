package javalevel2;

public class InefficientStringManipulation {

	public static void main(String[] args) {
		String sentence = "";

		// Simulate adding words to a sentence in a loop
		for (int i = 0; i < 5; i++) {
			sentence += "word" + i + " "; // Inefficient string concatenation
		}

		System.out.println("Final Sentence: " + sentence);

	}

}
