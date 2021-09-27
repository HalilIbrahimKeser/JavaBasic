public class TestClock { public static void main(String[] args) {
        Clock myClock = new Clock();
        myClock.setTime(0,0,0);
        if (myClock.getTimeAsString().equals("00:00:00"))
            System.out.println("Clock is correct");
        else
            System.out.println("Clock is incorrect: " + myClock.getTimeAsString());
        int result = Clock.incrementSeconds();
        if (result == 1)
            System.out.println("Clock is correct");
        myClock.setTime(23,50,59);
        System.out.println(myClock.getTimeAsString());
        Clock.incrementSeconds();
        System.out.println(myClock.getTimeAsString());
    }
}
