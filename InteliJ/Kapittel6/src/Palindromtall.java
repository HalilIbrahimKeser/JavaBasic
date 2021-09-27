public class Palindromtall {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Skriv inn et positivt heltall: ");
        int number = input.nextInt();
        if (reverse(number) == number) {
            System.out.printf("%s er et palindromtall.", number);
        }else{
            System.out.printf("%s er ikke et palindromtall.", number);
        }
    }
    private static int reverse(int number){
        int reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }
    private static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}