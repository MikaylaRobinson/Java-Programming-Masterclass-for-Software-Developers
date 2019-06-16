public class Main {

    public static void main(String[] args) {
        getDurationString(3600);
    }
    public static void getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainderMinutes = minutes % 60;
            System.out.println(hours + "h " + remainderMinutes + "m " + seconds + "s");
            return;
        }
        System.out.println("Invalid Value");
    }
    public static void getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainderSeconds = seconds % 60;
            getDurationString(minutes, remainderSeconds);
            return;
        }
        System.out.println("Invalid Value");
    }
}
