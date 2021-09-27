public class OrdneTreOrd {
	public static void main(String[] args) {
		
		// Opprett et Scanner objekt og noen string
		java.util.Scanner input = new java.util.Scanner(System.in);
		String ord1;
		String ord2;
		String ord3;

		// Be brukeren om input.
		System.out.print("Skriv inn første ord: ");
		String s1 = (input.nextLine());
		System.out.print("Skriv inn andre ord: ");
		String s2 = (input.nextLine());
		System.out.print("Skriv inn tredje ord: ");
		String s3 = (input.nextLine());
		input.close();

		// Sjekk om s1 er mindre enn s2 og s2 er stoerre s3 = B - C - A
		// sjekker 3! (6 muligheter) etter hverandre.
		if (s1.compareTo(s2) < 0 && s1.compareTo(s3) > 0 && s2.compareTo(s3) > 0) {
			ord1 = s3;
			ord2 = s1;
			ord3 = s2;
			System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
		} else {

		// Sjekk om s1 er stoerre enn s2. Og om 2 er mindre enn 3 = B - A - C.
		  if (s1.compareTo(s2) > 0 && s2.compareTo(s3) < 0 && s1.compareTo(s3) < 0) {
		    ord1 = s2;
			ord2 = s1;
			ord3 = s3;
			System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
			} else {

			// Sjekk om s1 er stoerre enn s2 og s2 er mindre s3 = C - A - B
			if (s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0 && s2.compareTo(s3) < 0) {
			 ord1 = s2;
			 ord2 = s3;
			 ord3 = s1;
			 System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
			 } else {

			  // Sjekk om s1 er stoerre enn s2 og s2 er stoerre s3 = C - B - A
			  if (s1.compareTo(s2) > 0 && s1.compareTo(s3) > 0 && s2.compareTo(s3) > 0) {
				ord1 = s3;
				ord2 = s2;
				ord3 = s1;
				System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
				} else {

			    // Sjekk om s2 er stoerre enn s3, positiv resultat = A - C - B
				if (s2.compareTo(s3) > 0 && s1.compareTo(s2) < 0) {
				ord1 = s1;
				ord2 = s3;
				ord3 = s2;
				System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
				} else {
					
					// Sjekk om det er riktig rekkefoelge fra foer = A - B - C
					if (s1.compareTo(s2) < 0 && s2.compareTo(s3) < 0) {
					ord1 = s1;
					ord2 = s2;
					ord3 = s3;
					System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
					} else {
						
					// Sjekk om s1 er lik s2 og s2 er stoerre s3 = A - A - A
					if (s1 == s2 && s2 == s3) {
					System.out.printf("Alle ordene er like");
					} else {
						
				    // Sjekk om s1 er lik s2 og s2 er mindre s3 = A - A - B
					if (s1 == s2 && s2.compareTo(s3) < 0) {
					ord1 = s1;
					ord2 = s2;
					ord3 = s3;
					System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
					} else {

					// Sjekk om s1 er lik s2 og s2 er mindre s3 = A - B - A
					if (s1 == s3 && s1.compareTo(s2) < 0) {
					ord1 = s1;
					ord2 = s3;
					ord3 = s2;
					System.out.printf("Tre ord i alfabetisk ordre er: %s %s %s ", ord1, ord2, ord3);
					} else {
								}
								}
								}
							}
						}
					}
				}
			}
		}
	}
}
