import java.util.Scanner;

public class GaltonBoxJorgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tracks;    //deklarere et array
        int[] balls;

        System.out.println("Galton Box!");
        System.out.print("Insert amount of balls: ");
        balls = new int[input.nextInt()];  // allokere minne til arrayet
        System.out.print("Insert number of tracks: ");
        tracks = new int[input.nextInt()];

        //avslutter hvis tracks er 0
        if (tracks.length == 0) {
            System.out.print("Number of tracks cannot be 0");
            System.exit(0);
        }
        input.close();

        //skriver ut sti til antall baller
        for (int j = 0; j < balls.length; j++) {
            tracks[getPathForOneBall(tracks)]++;
        }
        System.out.println();

        //skriver ut resultatet
        printResult(tracks);

    }

    // Returnerer indeks for soeylen med flest baller. Brukes i printResult metoden.
    private static int max(int[] tracks) {
        int max = 0;
        int index = 0;
        for(int i = 0 ; i < tracks.length ; i++) {
            if(tracks[i] > max) {
                max = tracks[i];
                index = i;
            }
        }
        return index;
    }

    // Skriver ut soeyler med sine baller til skjerm.
    private static void printResult(int[] tracks) {
        int max = tracks[max(tracks)];
        for (int i = 1; i <= tracks[max(tracks)]; i++) {
            for (int j = 0; j < tracks.length; j++) {
                if (tracks[j] < max) {
                    System.out.printf("    ");
                }
                else {
                    System.out.printf(" O  ");
                }
            }
            System.out.printf("%n");
            max--;
        }


        for (int j = 0; j < tracks.length; j++) {
            System.out.printf("[%d] ", j);
        }
        System.out.println();
    }

    // Genererer en tilfeldig sti for et ball, returnerer indeksen for soeylen som ballet har havnet inni.
    private static int getPathForOneBall(int[] tracks) {
        String pathPrint = "";
        int indexValue = 0;
        for (int i = 0; i < tracks.length-1; i++) {
            boolean path = Math.random() < 0.5;
            if (path) {
                pathPrint += "V";
            }
            else {
                pathPrint += "H";
                indexValue++;
            }
        }
        System.out.println(pathPrint);
        return indexValue;

    }
}

