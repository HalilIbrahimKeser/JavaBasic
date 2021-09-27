public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }


    public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2) {
        if ( (int)(decimal1 * 1000) == (int)(decimal2 * 1000) ) {
            return true;
        }else {
            return false;
        }
    }
}

