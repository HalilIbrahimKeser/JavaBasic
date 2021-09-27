public class Arsavgift {
	public static void main(String[] args) {

		// 1. Setter opp variabler.
		System.out.println("Beregn fremtidig årsavgift");
		double amount = 10000, interestRate = 5, years = 10, ekstraYears = 4;
		double beregningsRente = (interestRate / 100) + 1; // 5 % gjort om til 1.05 for lettere beregning

		// 2. For lokke som kjorer antall "years".
		for (int i = 1; i <= years; i++) {
			double total = amount * Math.pow(beregningsRente, i);
			System.out.printf("\nÅrsavgiften etter %1d år er: %.2f", i, total);

		}
		// 3. For lokke som kjorer antall "ekstraYears" etter forste lokke.
		System.out.printf("\n"); // ekstra mellomrom.
		double amountAfter10 = amount * Math.pow(beregningsRente, 10);
		for (int i = 1; i <= ekstraYears; i++) {
			double total1 = amountAfter10 * Math.pow(beregningsRente, i);
			System.out.printf("\nÅrsavgiften etter %1d år er: %.2f", i, total1);
		}
		// 4. Summerer belopet fra siste "ekstraYears" sammen til ny verdi.
		double sumAr11 = (amount * Math.pow(beregningsRente, 11));
		double sumAr12 = (amount * Math.pow(beregningsRente, 12));
		double sumAr13 = (amount * Math.pow(beregningsRente, 13));
		double sumAr14 = (amount * Math.pow(beregningsRente, 14));
		double sumSisteEkstraAar = (sumAr11 + sumAr12 + sumAr13 + sumAr14);
		System.out.printf("\n"); // ekstra mellomrom.
		System.out.printf("\nÅrsavgiften for år 11-14 er: %.2f", sumSisteEkstraAar);
	}
}
