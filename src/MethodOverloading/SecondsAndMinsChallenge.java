package MethodOverloading;

public class SecondsAndMinsChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "you have entered an incorrect amount of seconds";
        } else {
            int minutes = seconds / 60;
            return getDurationString(seconds / 60,seconds % 60);
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0) {
            return "you have entered an incorrect amount of minutes";
        }
        if (seconds <= 0 || seconds > 59){
            return "you have entered an incorrect amount of seconds";
        }
            int hours = minutes / 60;

            int remainingMinutes = minutes % 60;

            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
}
