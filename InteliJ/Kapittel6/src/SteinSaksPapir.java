import java.util.Scanner;

public class SteinSaksPapir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int antall = 0;
        System.out.print("Saks (0), Stein (1) eller Papir (2)? ");
        int tastatur = input.nextInt();
        while (tastatur != -1 && antall != 5) {
            antall++;
            System.out.print("Saks (0), Stein (1) eller Papir (2)? ");
        input.close();

        int randomNumber = (int) (Math.random() * 3);
            if (randomNumber == 1) {
                if (tastatur == 1) {
                    System.out.println("Datamaskin er stein. Du er stein. Uavgjort.");
                } else if (tastatur == 2) {
                    System.out.println("Datamaskin er stein. Du er papir. Du har vunnet!");
                } else if (tastatur == 0) {
                    System.out.println("Datamaskin er stein. Du er saks. Du tapte...");
                }
            } else if (randomNumber == 2) {
                if (tastatur == 1) {
                    System.out.println("Datamaskin er papir. Du er stein. Du tapte...");
                } else if (tastatur == 0) {
                    System.out.println("Datamaskin er papir. Du er saks. Du har vunnet!");
                } else if (tastatur == 2) {
                    System.out.println("Datamaskin er papir. Du er papir. Uavgjort.");
                }
            } else if (randomNumber == 0) {
                if (tastatur == 1) {
                    System.out.println("Datamaskin er saks. Du er stein. Du har vunnet!");
                } else if (tastatur == 0) {
                    System.out.println("Datamaskin er saks. Du er saks. Uavgjort.");
                } else if (tastatur == 2) {
                    System.out.println("Datamaskin er saks. Du er papir. Du tapte...");
                }
            } else {
                System.out.println("Ugyldig tall, kun 0, 1 eller 2 aksepteres.");
            }
            //System.exit(0);
        }
    }
}
