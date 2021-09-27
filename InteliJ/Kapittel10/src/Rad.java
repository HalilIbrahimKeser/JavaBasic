public class Rad {
    private char[] rad;

    //Default konstruktor
    Rad() {
        this(4); //Kall til sekundaer konstruktor
    }
    //Sekundaer konstruktor
    private Rad(int noOfS) {
        rad = new char[noOfS];
        for (int i = 0; i < noOfS; i++) {
            rad[i] = (char)(i+65);    //Lager et array med A - D
        }
    }
    boolean isLegalSeat(char seat) {
        if(seat == 'A' || seat == 'B' || seat == 'C' || seat == 'D') {
            return true; }
        if (!Character.isLetter(seat)) {
            System.out.println("Ikke gyldig tegn.");
            return false; }
        System.out.println("Ikke gyldig bokstav.");
        return false;
    }
    boolean assignSeat(char seat) {
        if (isLegalSeat(seat)) {
            if (rad[seat - 'A'] != 'X') {
                rad[seat - 'A'] = 'X';
                return true; }
        } return false;
    }
    public String toString() {
            return String.valueOf(rad); }
}

