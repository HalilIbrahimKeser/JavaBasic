public class Clock {
    private static int hours = 0;
    private static int minutes = 0;
    private static int seconds = 0;
    void setTime(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }
    static int incrementSeconds() {
        seconds++;
        if (seconds == 60) { seconds = 0;
            minutes++; }
        if (minutes == 60) {
            minutes = 0;
            hours++; }
        if (hours == 24)
            hours = minutes = seconds = 0;
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }
    public int incrementMinutes() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++; }
        if (hours == 24)
            hours = minutes = seconds = 0;
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }
    public int incrementHours() {
        hours++;
        if (hours == 24)
            hours = minutes = seconds = 0;
        return (hours * 60 * 60) + (minutes * 60) + seconds;
    }
    String getTimeAsString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}