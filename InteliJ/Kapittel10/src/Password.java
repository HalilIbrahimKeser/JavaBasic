class Password {
    //Returnerer true om passord er gyldig.
    static boolean checkPassword(String password) {
        return ( Password.checkLength(password) && Password.checkForOnlyDigitsAndLetters(password) && Password.checkThatContainsAtLeastThreeDigits(password) );
    }
    // Passordet må ha minst 10 tegn
    private static boolean checkLength(String password) {
        return password.length() >= 10;
    }
    //Passordet kan kun bestaa av tall og bokstaver og sjekker for tomme mellomrom.
    private static boolean checkForOnlyDigitsAndLetters(String password) {
        for (char ch : password.toCharArray())
            if (Character.isLetterOrDigit(ch) && !password.contains(" "))
                return true;
        return false;
    }
    //Passordet må ha minst 3 tall
    private static boolean checkThatContainsAtLeastThreeDigits(String password) {
        char element;
        int tall = 0;
        for(int i = 0; i < password.length(); i++ ){
            element = password.charAt( i );
            if( Character.isDigit(element) ){
                tall++;
            }
        }return tall >= 3;
    }
}

