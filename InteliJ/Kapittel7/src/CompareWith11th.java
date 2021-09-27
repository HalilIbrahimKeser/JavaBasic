public class CompareWith11th {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] num = new int[11];
        for (int i = 0; i <= 10; i++) {
            // Read a number
            System.out.print("Give in number with index " + i + ": ");
            num[i] = input.nextInt();
        }
        // Display the array
        for (int i = 0; i < 10; i++) {
            if (num[i] < num[10])
                System.out.println(num[i] + " er mindre enn " + num[10]);
            else if (num[i] ==  num[10])
                System.out.println(num[i] + " er lik enn " + num[10]);
            else
                System.out.println(num[i] + " er større enn " + num[10]);
        }
    }
}

