package oppgaver;

public class UseOperators {

	public static void main(String[] args) {
		// Opprett et Scanner objekt.
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Be brukeren om input.
		System.out.print("Skriv inn et heltall: ");
		int number = input.nextInt();

		// Skriver ut resultat
		System.out.printf("Er %d delelig med 5 og 6? %s%n",
						number, number % 5 == 0 && number % 6 == 0 ? "Ja": "Nei");
		
		System.out.printf("Er %d delelig med 5 eller 6? %s%n",
						number, number % 5 == 0 || number % 6 == 0 ? "Ja": "Nei");
		
		System.out.printf("Er %d delelig med 5 eller 6, men ikke begge? %s", 
						number, number % 5 == 0 ^ number % 6 == 0 ? "Ja": "Nei");


	}

}
