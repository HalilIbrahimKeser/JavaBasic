import java.util.Scanner;

public class ReverserArrayInPlace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Du skal taste inn ti tall nedenfor:\n");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Skriv inn tall nummer " + (i+1) + " : ");
            list[i] = input.nextInt();
        }
        System.out.print("Du tastet inn: \n");
        System.out.print("["+list[0]+", "+list[1]+", "+list[2]+", "+list[3]+", "+list[4]+", "
                +list[5]+", "+list[6]+", "+list[7]+", "+list[8]+", "+list[9]+"]");
        input.close();
        reverser(list);

        //Skriver ut arayet i revers.
        System.out.println("\nReversert array blir: ");
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("]");
     }
    private static int[] reverser(int[] list) {
        for (int i = 0; i < list.length; ++i) {
            if (list[i] > 1) {
                String value = String.valueOf(list[i]);
                String valueReversed = new StringBuilder(value).reverse().toString();
                list[i] = Integer.parseInt(valueReversed);
            }
        }
        for (int i = 0; i < list.length; ++i) {
            System.out.print("");
        }
        return list;
    }
}
