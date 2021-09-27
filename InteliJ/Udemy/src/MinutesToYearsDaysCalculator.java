
public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            double hours = (double) (minutes / 60);
            int days = (int) (hours / 24 );
            int years = (days / 365);
            int daysRemain = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + daysRemain + " d");
        }
    }

    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

}
