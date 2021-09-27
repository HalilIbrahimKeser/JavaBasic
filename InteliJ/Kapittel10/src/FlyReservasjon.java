import java.util.Scanner;

public class FlyReservasjon {
    private Rad[] rader;

    //Default konstruktor
    FlyReservasjon() {
        this(10);
    }
    //Konstruktor som setter inn instanser av rad klassen i arrayet rader.
    private FlyReservasjon(int antallRader) {
        rader = new Rad[antallRader];
        for (int i = 0; i < antallRader; i++) {
            rader[i] = new Rad(); }
    }
    public static void main(String[] args) {
        FlyReservasjon fr = new FlyReservasjon();
        Rad r = new Rad();
        Scanner input = new Scanner(System.in);
        //Dialog
        while (true) {
            System.out.print("Hvilken rad (1 - 10) vil du sitte paa?  ");
            int row = input.nextInt();
            if (row == -1) {
                System.out.println("Takk for at du brukte programmet.");
                input.close();
                System.exit(0); }
            if (fr.radOK(row)) {
                System.out.println("Hvilket sete vil du sitte paa?  ");
                char seat = input.next().toUpperCase().charAt(0);   //Setter input som store bokstavee
                if (fr.reserveSeat(row, seat)) {
                    System.out.println("Valgt sete er reservert.");
                } else {
                    System.out.println("Valgt sete er opptatt. Vennligst velg et nytt.");
                } fr.show();  //Kjoerer metode show(), som skriver ut seteplassene.
            } else {
                System.out.println("Valgt rad er ugyldig."); }
        }
    }
    private boolean radOK(int row) {
        return row <= 10 && row > 0;
    }
    private Rad getRad(int row) {
        return rader[row];
    }
    boolean reserveSeat(int row, char seat) {
        return getRad(row - 1).assignSeat(seat);
    }
    private void show() {
        for (int i = 0; i < rader.length; i++) {
            System.out.printf("%-3s", i + 1);
            System.out.println(rader[i]);
        }
    }
}