package oppgaver;

import java.util.Scanner;

public class PunktInniSirkel {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Opprett en scanner objekt
		Scanner input = new Scanner(System.in);
		
		// Be brukeren om input.
		System.out.print("Oppgi x og y koordinater for et punkt: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//Beregn avstanden fra origo til punktet.
		double avstand = Math.pow(x * x + y * y, 0.5);
				
		// Skriv ut resultat
			System.out.printf("Punktet (%.1f, %.1f) er %s inni sirkelen", x, y, avstand <= 10 ? "": "ikke");
		}
}
	
