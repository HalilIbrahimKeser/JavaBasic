public class Demo {
        public static void main(String[] args) {
            java.util.Scanner input1 = new java.util.Scanner(System.in);
            System.out.print("Skriv inn et positivt heltall: ");
            int number = input1.nextInt();
            if (reverse(number) == number) {
                System.out.printf("%s er et palindromtall.", number);
            }else{
                System.out.printf("%s er ikke et palindromtall.", number);
            }
        }
        public static int reverse (int number){
            int reversedNumber = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
                number /= 10;
            }
            return reversedNumber;
        }
        public static boolean isPalindrome(int number) {
            return number == reverse(number);
        }
}

