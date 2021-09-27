package oppgaver;

import java.util.Scanner;

public class FutureInvestmentValue {
	public static void main(String[] args) {
		// Opprett en scanner objekt
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Be brukeren om input.
		System.out.print("Oppgi investeringsverdien, antall år og årlig rente eller avkastning: ");
		double investeringsverdi = input.nextDouble();
		double antallAar = input.nextDouble();
		double maanedligRente = input.nextDouble() / 1200;
		
		//Beregn Fremtidig investeringsverdi.
		double FremtidigInvesteringsverdi = investeringsverdi * Math.pow(1 + maanedligRente, antallAar * 12);
				
		// Skriv ut resultat
		System.out.printf("Fremtidig investeringsverdi er: %.2f", FremtidigInvesteringsverdi);
	}

}
