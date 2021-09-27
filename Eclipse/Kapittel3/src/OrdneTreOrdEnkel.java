public class OrdneTreOrdEnkel {
	public static void main(String[] args) {

		// Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Be brukeren om input.
		System.out.print("Skriv inn første ord: ");
		String s1 = (input.nextLine());
		System.out.print("Skriv inn andre ord: ");
		String s2 = (input.nextLine());
		System.out.print("Skriv inn tredje ord: ");
		String s3 = (input.nextLine());
		input.close();

		// Sjekker om stringene er sortert alfabetisk mot hverandre
		// hvis ikke, byttes variablene.
		if (s1.compareTo(s2) > 0) {
			String temp = s2;
			s2 = s1;
			s1 = temp;
		}
		if (s1.compareTo(s3) > 0) {
			String temp = s1;
			s1 = s3;
			s3 = temp;
		}
		if (s2.compareTo(s3) > 0) {
			String temp = s2;
			s2 = s3;
			s3 = temp;
		}

		// Skriver ut til consol
		System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", s1, s2, s3);
	}
}
