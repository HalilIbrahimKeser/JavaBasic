public class Telefontastatur {

	public static void main(String[] args) {

		// Opprett et Scanner objekt.
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Be bruker oppgi en bokstav:
		System.out.print("Oppgi en bokstav: ");
		String inntastningFraBruker = input.nextLine();
		input.close();

		// Finner korresponderende tall
		String inntastning = inntastningFraBruker.toUpperCase(); // til store bokstaver
		switch (inntastning) {
		case "A":
		case "B":
		case "C":
			System.out.printf("Korresponderende tall for: %s er: 2", inntastning);
			break;
		case "D":
		case "E":
		case "F":
			System.out.printf("Korresponderende tall for: %s er: 3", inntastning);
			break;
		case "G":
		case "H":
		case "I":
			System.out.printf("Korresponderende tall for: %s er: 4", inntastning);
			break;
		case "J":
		case "K":
		case "L":
			System.out.printf("Korresponderende tall for: %s er: 5", inntastning);
			break;
		case "M":
		case "N":
		case "O":
			System.out.printf("Korresponderende tall for: %s er: 6", inntastning);
			break;
		case "P":
		case "Q":
		case "R":
		case "S":
			System.out.printf("Korresponderende tall for: %s er: 7", inntastning);
			break;
		case "T":
		case "U":
		case "V":
			System.out.printf("Korresponderende tall for: %s er: 8", inntastning);
			break;
		case "W":
		case "X":
		case "Y":
		case "Z":
			System.out.printf("Korresponderende tall for: %s er: 9", inntastning);
			break;
		case " ":
			System.out.printf("Korresponderende tall for: %s er: 0", inntastning);
			break;
		case "#":
			System.out.printf("Korresponderende tall for: %s er: ^", inntastning);
			break;
		case "+":
			System.out.printf("Korresponderende tall for: %s er: *", inntastning);
			break;
		default:
			System.out.printf("%s har ikke et korresponderende tall. ", inntastning);
		}

	}
}
