

public class GjennomsnittligHastighet {

	public static class AverageSpeed {
		public static void main(String[] args) {
			System.out.println("Hastighet i km pr time ");
			System.out.println(	24 / (1 + (40 + 35.0 / 60 ) / 60 ) * 1.6);
				// Quiz
			System.out.println("Quiz ");
				System.out.println( 15 / (1 + (45 + 30 / 60 ) / 60));  // feil
				System.out.println( 15 / (1 + 45 + 30.0 / 60 / 60));// feil
				System.out.println( 15 / (1 + (45 + 30.0 / 60) / 60));  // korrekt
				System.out.println( 15 / (1 + 45.0 / 60 + 30.0 / (60 * 60))); // korrekt
				System.out.println(  2 + 3 * 6 + 7 / 2);
			}
		}}
