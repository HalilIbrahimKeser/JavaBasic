import java.util.Scanner;

public class EkteUekteBroek {
	public static void main(String[] args) {

		// Ber bruker intaste teller og nevner.
		@SuppressWarnings("resource")
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Oppgi teller: ");
		int teller = tastatur.nextInt();
		System.out.print("Oppgi nevner: ");
		int nevner = tastatur.nextInt();

		// Regner ut noen variabler til senere bruk.
		int heltall = (teller / nevner);
		int nyTeller = (teller % nevner);

		// Tellene er like.
		if (teller == nevner) {
			System.out.printf("%d / %d er en 1", teller, nevner);
		    } else {
		
		// = 0.
		if (nevner == 0) {
			System.out.printf("%d / %d er en NaN", teller, nevner);
		   } else {
		    	
		    	
		// Teller er mindre enn nevner
		if (teller < nevner) {
			System.out.printf("%d / %d er en ekte br�k", teller, nevner);
			} else {

		// Teller er st�rre enn nevner og teller delt p� nevner lik 0.
		if ((teller > nevner) && (teller % nevner == 0)) {
			System.out.printf("%d / %d er en uekte br�k", teller, nevner);
			System.out.printf("\nDen kan reduseres til %d.", heltall);
			} else {

		// Teller er st�rre enn nevner og teller delt p� nevner ulik 0.
		if (teller > nevner) 
				if (teller % nevner != 0) {
			System.out.printf("%d / %d er en uekte br�k", teller, nevner);
			System.out.printf("\nDet er et blandet tall %d +  %d / %d.", heltall, nyTeller, nevner);
			} else {
			}
		}
	}
}}
}}
/* Sp�rsm�l til student ass. eller l�rer.
 	- Hvordan kunne jeg ha brukt n�stede if-else i denne sammenheng. Ref. bruk (hint: n�stede if-else l�kker)
*/
