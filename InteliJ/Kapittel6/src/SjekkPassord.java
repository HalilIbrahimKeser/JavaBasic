

public class SjekkPassord {
    public static void main(String[] args) {
        System.out.print("Skriv inn ditt hemmelige passord: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        String passord = input.nextLine();
        if (erPassordGyldig(passord))
            System.out.print("Passordet ditt er gyldig. \n");
        else
            System.out.print("Passordet ditt er ikke gyldig. \n");
    }
    //Returnerer true om passord er gyldig.
    private static boolean erPassordGyldig(String passord) {
        return (erDetBokstaverOgSiffer(passord) && passordLengdeKorrekt(passord) && erDetMinstToTall(passord));
    }
    private static boolean passordLengdeKorrekt(String passord) {
        return passord.length() >= 8;
    }
    //Er det bokstaver og siffer og sjekker for tomme mellomrom.
    private static boolean erDetBokstaverOgSiffer(String passord) {
        for (char ch : passord.toCharArray())
            if (Character.isLetterOrDigit(ch) && !passord.contains(" "))
                return true;
        return false;
    }
    private static boolean erDetMinstToTall(String passord) {
        char element;
        int tall = 0;
        for(int i = 0; i < passord.length(); i++ ){
            element = passord.charAt( i );
            if( Character.isDigit(element) ){
                tall++;
            }
        }return tall >= 2;
    }
}