import java.util.*;

public class BesteStudenter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//1. Lager en scanner objekt
		Scanner input = new Scanner(System.in);

		//2. Be brukeren om antall studenter
		System.out.print("Oppgi antall studenter: ");
		int numberOfStudents = input.nextInt();

		//3. Variabler for � holde de to beste
		int bestScore = 0, secondBestScore = 0;
		String bestStudent = "", secondBestStudent = "";

		//4. Variabler for � holde den studenten vi leser.
		int score = 0;
		String student;

		for (int i = 0; i < numberOfStudents; i++) {
		//5. Leser inn score og navn p� samme linjen.
		//   Bruker trim metode for � fjerne mellomrom f�r og etter navn.
			System.out.print("Oppgi studentens score og navn: ");
			score = input.nextInt();
			student = input.nextLine().trim();

			if (score > bestScore) {
				secondBestStudent = bestStudent; // F�rsteplass student er p� andre plass n�
				secondBestScore = bestScore;

				bestStudent = student; // Ny student er n� p� f�rste plass.
				bestScore = score;
			} else if (score > secondBestScore) {
				secondBestStudent = student; // Ny student er p� andre plass n�.
				secondBestScore = score;
			}
			//input.close();
		}
		//6. Viser resultat
		System.out.println("\nTopp to Studenter: ");
		System.out.printf("F�rste plass: %s med score: %d%n", bestStudent, bestScore);
		System.out.printf("Andre plass: %s med score: %d%n", secondBestStudent, secondBestScore);
	}
}
