package javalevel2;

public class EfficientStringManipulation {

	public static void main(String[] args) {
		// Using StringBuilder for efficient string manipulation
        StringBuilder sentence = new StringBuilder();
        
        // Simulate adding words to a sentence in a loop
        for (int i = 0; i < 5; i++) {
            sentence.append("word").append(i).append(" ");  // Efficient string concatenation
        }

        System.out.println("Final Sentence: " + sentence.toString());

	}

}
