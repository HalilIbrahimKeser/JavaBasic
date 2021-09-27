// Regner ut PI ved hjel av løkke og skriver resultatet av hver 10000 ved hjelp av % (modulo).
public class BeregnPI {

	public static void main(String[] args) {

		//Variabler
		double sumAvLedd = 0;
		
		// Beregner PI
		for (double i=1; i<=100000; i++) {
			double teller = 4*Math.pow(-1,(i+1));   //Formel:
			double nevner = (2 * i)-1;				//4 ((-1)^i+1) / (2*1)-1
			double enkelLedd = (teller/nevner);	    //Regner ut enkelt ledd i rekke, a_n rekker formel.
			sumAvLedd = enkelLedd + sumAvLedd;
			
			if (i % 10000 == 0) {
		//System.out.printf("\nFor %.0f ledd i rekken er verdien av leddet: %.15f ", i, enkelLedd); //Om man vil skrive ut verdi avledd
		System.out.printf("\nFor %.0f ledd i rekken er verdien av pi:  %.15f",i, sumAvLedd);
			}
		}
	}
}
