import java.util.Scanner;

@SuppressWarnings("unused")
public class AvstandToPunkter {
	
	public static void main(String[] args) {
		//Scanner objekt
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		double earthRadius = 6371.01;

		System.out.print("Skriv inn breddegrad og lengdegrad for punkt 1: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		
		System.out.print("Skriv inn breddegrad og lengdegrad for punkt 2: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
        double sineVal = Math.sin(x1) * Math.sin(x2);
        double cosineVal = Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2);
        double result = earthRadius * Math.acos(sineVal + cosineVal);
		System.out.printf("Avstanden mellom punktene er %.2f km", result);	
     
	}

}
