import java.util.Scanner;

public class BeregnBMI {
	public static void main(String[] args) {
		// Opprette et scanner objekt
		@SuppressWarnings("resource") //Faar en "lampe" anbefaling av systemet til aa legge denne inn, eller endre scanner input.
		Scanner input = new Scanner(System.in);

		// Be bruker taste in vekt og hoeyde
		System.out.println("Programmet beregner din BMI");
		System.out.print("Oppgi din vekt i kilogram: ");
		double weight = input.nextDouble();
		System.out.print("Oppgi din høyde i meter: ");
		double height = input.nextDouble();

		// Beregner BMI
		double bmi = weight / (height * height);

		// Vis resultat
		System.out.printf("Din BMI er: %.15f kg/m^2", bmi);
	}

}
