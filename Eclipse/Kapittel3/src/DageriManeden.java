import java.util.Scanner;

public class DageriManeden {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Input fra bruker.
		System.out.print("Year?: ");
		int year = input.nextInt();		
		input.nextLine(); // Consume newline left-over	
		System.out.print("Month? (3 chars): ");
		String monthinput = input.nextLine();
		input.close();
		
	    // Smaa bokstaver, saa switche string til integer
		String month1 = monthinput.toLowerCase();
		switch (month1) {
		case "jan":
			month1 = "1";
			break;
		case "feb":
			month1 = "2";
			break;
		case "mar":
			month1 = "3";
			break;
		case "apr":
			month1 = "4";
			break;
		case "mai":
			month1 = "5";
			break;
		case "jun":
			month1 = "6";
			break;
		case "jul":
			month1 = "7";
			break;
		case "aug":
			month1 = "8";
			break;
		case "sep":
			month1 = "9";
			break;
		case "okt":
			month1 = "10";
			break;
		case "nov":
			month1 = "11";
			break;
		case "des":
			month1 = "12";
			break;
		default:
			System.out.println("Month does not exist");
		}
		
		// Hvis ikke antall bokstaver lik 3.
		int monthlenght = monthinput.length();
		if (monthlenght != 3) {
			System.out.println("Month does not exist");
			System.exit(0);
			}
		int monthInteger = Integer.parseInt(month1); // Gjoer String om til Integer
		
		switch (monthInteger * 1) {
		case 1:
			System.out.print("The month has 31 days");
			break;
		case 2:
			@SuppressWarnings("unused") // Overse feilmelding i Eclipse
			boolean leap;
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				leap = true;
				System.out.print("The month has 29 days");
			} else {
				System.out.print("The month has 28 days");
			}
			break;
		case 3:
			System.out.print("The month has 31 days");
			break;
		case 4:
			System.out.print("The month has 30 days");
			break;
		case 5:
			System.out.print("The month has 31 days");
			break;
		case 6:
			System.out.print("The month has 30 days");
			break;
		case 7:
			System.out.print("The month has 31 days");
			break;
		case 8:
			System.out.print("The month has 31 days");
			break;
		case 9:
			System.out.print("The month has 30 days");
			break;
		case 10:
			System.out.print("The month has 31 days");
			break;
		case 11:
			System.out.print("The month has 30 days");
			break;
		case 12:
			System.out.print("The month has 31 days");
		}
	}
}
