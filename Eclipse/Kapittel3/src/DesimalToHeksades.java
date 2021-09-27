public class DesimalToHeksades {

	public static void main(String[] args) {
		
        // Opprett et Scanner objekt.
        java.util.Scanner input = new java.util.Scanner(System.in);
       
        // Be brukeren om input.
        System.out.print("Skriv inn ett desimaltall mellom 0 og 15: ");
        int decimal = input.nextInt();
        if (decimal < 0 || decimal > 15) {
            System.out.printf("%d er ikke i tillatt.", decimal);
        input.close();
            return;
            
        }
        // Flere måter å gjøre det på, her er den enkleste:
        // char hex = Integer.toHexString(decimal).charAt(0);
        // En annen måte er:
        // String hexDigits = "0123456789ABCDEF";
        // char hex = hexDigits.charAt(decimal);
        // Den mist kompliserte måte å gjøre dette på ved hjelp av switch-case er:
        char hex;
        switch (decimal) {
            case 10: hex = 'A';
                break;
            case 11: hex = 'B';
                break;
            case 12: hex = 'C';
                break;
            case 13: hex = 'D';
                break;
            case 14: hex = 'E';
                break;
            case 15: hex = 'F';
                break;
            default:
                hex = ( char ) (decimal + 48);
        }
        // Skriver ut resultat
        System.out.printf("%d i heksadesimal er %s", decimal, hex);
       


        input.close();
        //scannerObject.close(); 
	}

}
