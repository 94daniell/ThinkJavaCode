public class Time {

    public static void main(String[] args) {
        int hour, minute, second;
        hour = 13;
        minute = 32;
        second = 10;
        int timeOfDay = (hour * 3600) + (minute * 60) + second;
        System.out.println(timeOfDay);
        int untilMidnight = (24 * 3600) - timeOfDay;
        System.out.println(untilMidnight);
        System.out.println(untilMidnight / (24.0 * 3600));
        int startHour = hour;
        int startMinute = minute;
        int startSecond = second;
        hour = 13;
        minute = 38;
        second = 12;
        System.out.print("Elapsed time is " + (hour - startHour));
        System.out.print(" hours, " + (minute - startMinute));
        System.out.print(" minutes, and " + (second - startSecond));
        System.out.println(" seconds.");
    }
}