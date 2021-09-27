public class PalindromeInteger {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123) + " " + isPalindrome(131));
    }

    public static int reverse(int number) {
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
