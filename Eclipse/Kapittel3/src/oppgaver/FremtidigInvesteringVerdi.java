package oppgaver;

import java.util.Scanner;

public class FremtidigInvesteringVerdi {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		// Be brukeren om input.
		System.out.print("Oppgi investeringsverdi, antall år og årlig rente: ");
		double investeringsverdi = input.nextDouble();
		double antallAar = input.nextDouble();
		double maanedligRente = input.nextDouble() / 1200;
		
		//Beregn Fremtidig investeringsverdi.
		double FremtidigInvesteringsverdi = investeringsverdi * Math.pow(1 + maanedligRente, antallAar * 12);
				
		// Skriv ut resultat
		System.out.printf("Fremtidig investeringsverdi er: %.2f", FremtidigInvesteringsverdi);

	}

}
