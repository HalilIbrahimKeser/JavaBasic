package oppgaver;

import java.util.Scanner;

public class SekunderKonverteringBasicPC {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		long secondsFromUser, seconds, minutes, hours, temporary_result;

		// Be brukeren om input.
		System.out.print("Oppgi antall sekunder: ");
		secondsFromUser = input.nextLong();
		temporary_result = secondsFromUser; // regner på temporary_result fra nå av

		// anta 3661 som input..
		seconds = temporary_result % 60; // seconds = 1
		temporary_result = temporary_result / 60; // temporary_result = 61
		minutes = temporary_result % 60; // minutes = 1
		hours = temporary_result / 60; // hours = 1

		// Skriv ut resultat
		System.out.printf("%d sekunder er %2d time, %2d minutt og %2d sekund", secondsFromUser, hours, minutes,
				seconds);

	}

}
