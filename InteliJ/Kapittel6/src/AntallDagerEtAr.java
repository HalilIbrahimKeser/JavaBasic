public class AntallDagerEtAr {
    public static void main(String[] args) {
        for (int year = 2000; year <= 2021; year++) {
            System.out.printf("%nÅr %s har %s dager. ", year, numberOfDaysInAYear(year));
        }
    }
    private static int numberOfDaysInAYear(int year) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                return year = (366);
            }else{
                return year = (365);
            }
     }
}
