import java.util.Arrays;
import java.util.Scanner;

public class SummerDiagonalenIMatrisen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] sumDiagonal = new double[4][4];

        System.out.println("Oppgi en 4x4 matrise rad for rad, eller skriv 16 tall i en rekke: ");
        for (int i = 0; i < sumDiagonal.length; i++) {
            for (int j = 0; j < sumDiagonal[0].length; j++) {
                sumDiagonal[i][j] = input.nextDouble();
            }
        }
        System.out.println(Arrays.toString(sumDiagonal[0]));
        System.out.println(Arrays.toString(sumDiagonal[1]));
        System.out.println(Arrays.toString(sumDiagonal[2]));
        System.out.println(Arrays.toString(sumDiagonal[3]));
        System.out.printf("Summen av tall i diagonalen fra hoeyre til venstre er:  %.2f", sumMajorDiagonal(sumDiagonal));
        double AverageOfDiagonal = ((sumMajorDiagonal(sumDiagonal)) / sumDiagonal.length);
        System.out.printf("\nGjennomsnittet av tall i diagonalen er: %.2f%n", AverageOfDiagonal);
    }
    private static double sumMajorDiagonal(double[][] sumDiagonal) {
        double sum = 0;
        for (int i = 0; sumDiagonal.length > i; i++) sum += sumDiagonal[i][i];
        return sum;
    }
}

