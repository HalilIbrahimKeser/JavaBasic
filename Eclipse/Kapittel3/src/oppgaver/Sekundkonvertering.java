package oppgaver;
import java.util.Scanner;

public class Sekundkonvertering {
	private static Scanner input;	
	public static void main(String[] args) {
		// Leser inn sekunder fra brukeren og gjør de om til timer, minutter og sekunder. 
		
		input = new Scanner(System.in);
		// Prompt the user to enter seconds
		System.out.print("Oppgi antall sekunder: ");
		long totalSeconds = input.nextLong();
		
		// Calculate hours, minutes and seconds
		long totalMinutes = (totalSeconds / 60);
		long totalHours = (totalMinutes / 60);
		long totalSecondsLeft = (totalSeconds % 60); 
		
		// Display result
		System.out.printf("%d sekunder er %2d timer,  %2d minutter og  %2d sekunder.", totalSeconds, totalHours, totalMinutes, totalSecondsLeft );
	}

}
