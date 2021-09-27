

public class KonvertCelsAndFahr {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %5s %-15s %-15s %n", "Celsius", "Fahrenheit",
                "|     ", "Fahrenheit", "Celsius");
        System.out.println("---------------------------------------------------------------");
        double celsius = 40;
        double fahrenheit = 120;

        for (int i = 1; i <= 10; celsius--, fahrenheit -= 10, i++) {
            System.out.printf("%-15.1f %-15.1f %5s %-15.1f %-15.2f %n",
                    celsius, celsiusToFahrenheit(celsius), "|      ",
                    fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }
    private static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * (celsius - 32);
    }
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
