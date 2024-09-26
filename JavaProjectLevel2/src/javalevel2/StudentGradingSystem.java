package javalevel2;

import java.util.TreeSet;

public class StudentGradingSystem {

	public static void main(String[] args) {
		TreeSet<Integer> studentScores = new TreeSet<>();

        // 1. Add scores to the TreeSet
        studentScores.add(85);
        studentScores.add(92);
        studentScores.add(76);
        studentScores.add(85); // Duplicate, will not be added
        studentScores.add(100);

        // Display all scores (automatically sorted in ascending order)
        System.out.println("Student scores (sorted): " + studentScores);

        // 2. Find the highest score (last element in the set)
        int highestScore = studentScores.last();
        System.out.println("Highest score: " + highestScore);

        // 3. Find the lowest score (first element in the set)
        int lowestScore = studentScores.first();
        System.out.println("Lowest score: " + lowestScore);

        // 4. Add a new score and display the updated sorted set
        studentScores.add(88);
        System.out.println("Updated student scores (sorted): " + studentScores);

        // 5. Display the total number of unique scores
        System.out.println("Total number of unique scores: " + studentScores.size());
	}

}
