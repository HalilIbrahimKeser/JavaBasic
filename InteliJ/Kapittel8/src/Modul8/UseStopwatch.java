package Modul8;

public class UseStopwatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        final int NUMBER_OF_PRIMES_TO_FIND = 30000;
        int count = 0;
        long number = 2;

        stopWatch.start();
        while (count < NUMBER_OF_PRIMES_TO_FIND)
            if (isPrimeBad(number++)) count++;
        stopWatch.stop();

        System.out.printf("Tid for å finne %d primtall med metode 1 er %13d nanosekunder. %n",
                NUMBER_OF_PRIMES_TO_FIND, stopWatch.getElapsedTime());

        count = 0;
        number = 2;
        stopWatch.start();

        while (count < NUMBER_OF_PRIMES_TO_FIND)
            if (isPrimeGood(number++)) count++;
        stopWatch.stop();
        System.out.printf("Tid for å finne %d primtall med metode 2 er %13d nanosekunder.",
                NUMBER_OF_PRIMES_TO_FIND, stopWatch.getElapsedTime());
    }
    private static boolean isPrimeBad(long number) {
        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0)  // If true, number is not prime
                return false; // number is not a prime

        return true; // number is prime
    }
    private static boolean isPrimeGood(long number) {
        // Sjekk om tallet er 1, eller delelig på to.
        // I dette tilfellet er det unødvendig siden vi
        // sender ikke partall til denne metoden, men
        // generelt så burde vi ha dette sjekk på plass.
        if ((number > 2 && number % 2 == 0) || number == 1)
            return false;

        // Relativt enkelt og kjapt sjekk om tallet er primtall.
        // Start på 3 og gå opp til kvadratrot av tallet og
        // inkrementer med 2 slik at vi sjekker kun 3,5,7...
        // siden vi har fjernet partall.
        int maxCheck = ( int ) Math.sqrt(number);
        for (int divisor = 3; divisor <= maxCheck; divisor += 2)
            if (number % divisor == 0)
                return false;
        return true;
    }
}
class StopWatch {
    private long startTime = System.nanoTime();
    private long endTime = startTime;

    public void start() {
        startTime = System.nanoTime();
    }
    public void stop() {
        endTime = System.nanoTime();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
