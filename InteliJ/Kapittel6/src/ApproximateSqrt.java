public class ApproximateSqrt {

    public static void main(String[] args) {
        System.out.print("Skriv inn et positivt tall som vi skal finne kvadratrota av: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        double number = input.nextDouble();

        System.out.println("Oppgi det du vet er en dårlig seed : ");
        double badSeed = input.nextDouble();
        System.out.println("Oppgi det du vet er en god seed : ");
        double goodSeed = input.nextDouble();
        System.out.printf("Tilnærmet verdi for kvadratrot av %.2f med %f som seed er: %.5f.\n",
                number, badSeed, sqrtBabylon(number, badSeed));
        System.out.printf("Tilnærmet verdi for kvadratrot av %.2f med %f som seed er: %.5f.",
                number, goodSeed, sqrtBabylon(number, goodSeed));
    }

    public static double sqrtBabylon(double number, double seed) {
        double nextGuess = seed, lastGuess = 0;
        int count = 0;
        while (Math.abs(nextGuess - lastGuess) >= 0.00001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (number / lastGuess)) * 0.5;
            count++;
        }
        System.out.println("Antall iterasjoner er: " + count);
        return nextGuess;
    }
}

