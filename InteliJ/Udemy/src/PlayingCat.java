public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temp){
        if (summer == true && temp >= 25 && temp <= 45 ){
            return true;
        }else if (summer == false && temp >= 25 && temp <= 35 ) {
            return true;
        }else
            return false;
    }

    public static void main(String[] args){
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 25));
    }
}
