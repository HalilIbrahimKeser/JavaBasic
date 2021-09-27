import java.util.Scanner;

public class BonneMaskin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oppgi antall baller: ");
        int balls = input.nextInt();
        String[] ballPath = new String[balls];

        System.out.print("Oppgi antall spor: ");
        int numberOfTacks = input.nextInt();
        int[] tracks = new int[numberOfTacks];

        if (numberOfTacks == 0 || balls == 0) {
            System.out.print("Antall baller eller spor kan ikke vaere 0");
            System.exit(0);
        }
        // Viser alle tracks.
        for (int i = 0; i < balls; i++) {
            ballPath[i] = getPathForOneBall(tracks);
            System.out.printf("%5s\n", ballPath[i]);
        }
        input.close();

        printResult(tracks);
    }
    /** Returnerer indeks for soeylen med flest baller. Brukes i printResult metoden. */
    private static int max(int[] tracks) {
        int max = 0;
        int index = 0;
        for(int i = 0 ; i < tracks.length ; i++)
            if (tracks[i] > max) {
                max = tracks[i];
                index = i;
            }
        return index;
    }
    /** Genererer en tilfeldig sti for et ball, returnerer indeksen for soeylen */
    private static String getPathForOneBall(int[] tracks) {
        StringBuilder ballPath = new StringBuilder();
        for (int i = 0; i < tracks.length - 1; i++) {
            boolean path = Math.random() < 0.5;
            if (path) { ballPath.append("R"); }
            else ballPath.append("L");
        }
        int position = getBallPosition(ballPath.toString(), 'R');
        tracks[position]++;
        return ballPath.toString();
    }
    private static int getBallPosition(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) count++;
        }
        return count;
    }
    /** Skriver ut soeyler med sine baller til skjerm. */
    private static void printResult(int[] tracks) {
        int max = tracks[max(tracks)];
        for (int i = 1; i <= tracks[max(tracks)]; i++) {
            for (int track : tracks)
                if (track < max) System.out.print("    ");
                else {
                    System.out.print(" O  ");
                }
            System.out.printf("%n");
            max--;
        }
        for(int j = 0; j < tracks.length; j++){
            System.out.printf("[%d] ", j);
        }
            System.out.println(" ");
    }
}
