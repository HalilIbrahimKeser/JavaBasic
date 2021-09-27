import java.util.Scanner;

public class SummerSifferietTall {
	private static Scanner input;
	
	public static void main(String[] args) {
		// Scanner objekt
		input = new Scanner(System.in);

		// Be bruker til å taste inn et tall mellom 0 og 999
		System.out.print("Oppgi et tall mellom 0 og 999: ");
		int number = input.nextInt();

		// Beregn sum
		int sum = 0;
		int num = number;
		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		System.out.printf("Summen av siffer i %d er: %d", number, sum);
	}
}
