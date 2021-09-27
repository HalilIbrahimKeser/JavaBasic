package Oppgaver;
import java.util.Scanner;

public class ComputeBMI {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		// Prompt the user to enter weight in pounds
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant

		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Display result
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Biraz yemek yesene essolessek Evin. Niye yemek yemiyon.!");
		else if (bmi < 25)
			System.out.println("Litt sisko men det gar bra");
		else
			System.out.println("Sisko patates sisko patates!");

	}

}
