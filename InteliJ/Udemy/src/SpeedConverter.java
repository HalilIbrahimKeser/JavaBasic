
public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        printConversion(1.5);
        printConversion(-1);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = (kilometersPerHour / 1.609);
            return Math.round(milesPerHour);
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
