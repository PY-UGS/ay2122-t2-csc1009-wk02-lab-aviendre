public class Clock {
    
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes /60;

        totalSeconds = totalSeconds % 60;
        totalMinutes = totalMinutes % 60;
        totalHours = totalHours % 24;

        System.out.println("Current time is " + totalHours + ":" + totalMinutes + ":" + totalSeconds + " GMT");
    }
}
