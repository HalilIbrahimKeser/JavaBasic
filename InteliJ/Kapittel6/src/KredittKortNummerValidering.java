public class KredittKortNummerValidering {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        if (isValid(number))
            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }
    //Return true if valid.
    private static boolean isValid(long number) {
        return (getSize(number) >= 13) && (getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))
                && (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }
    //Doble hvert andre siffer fra hoyre mot venstre.
    //Om resulterer i to-sifret tall, legger sammen og far et ensifret tall.
    private static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2)
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        return sum;
    }
    // Om kun ett siffer etter dobling, returner tallet, hvis ikke returnerer tallet ved a addere de to sifrene.
    public static int getDigit(int number) {
        if (number < 9)
            return number;
        return number / 10 + number % 10;
    }
    // Legger til alle sifrene på de odde plassene fra høyre til venstre i kortnummeret.
    private static int sumOfOddPlace(long number){
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");
        return sum;
    }
    // Returner true hvis tallet d er en prefix for kredittkortnummeret.
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }
    // Returner antall siffer i kredittkortnummeret .
    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }
    // Returner de forste k siffer fra number.
    // Hvis antall siffer i number er mindre enn k, returner number.
    public static long getPrefix(long number, int k) {
            long result = number;
            for (int i = 0; i < getSize(number) - k; i++)
                result /= 10;
            return result;
    }
}
