import java.util.Scanner;

public class SnuTekst {
	public static void main(String[] args) {

		// Scanner objekt.
		Scanner input = new Scanner(System.in);

		// Input fra bruker.
		System.out.print("Skriv inn tekst strengen: ");
		String inntastetTekst = input.nextLine();
		input.close();

		// Snur om.
		String reverser = "";
		for (int i = 0; i < inntastetTekst.length(); i++) {
			reverser = inntastetTekst.charAt(i) + reverser;  //Legger til hver char til fronten
		}

		// Skriver ut.
		System.out.println(reverser);
	}
}
