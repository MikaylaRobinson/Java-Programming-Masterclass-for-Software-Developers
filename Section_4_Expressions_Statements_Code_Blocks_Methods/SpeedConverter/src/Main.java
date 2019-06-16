import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour * 0.621371;
            return round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) == -1) {
            System.out.println("Invalid Value");
        } else {
            String output = kilometersPerHour
                    + " km/h = "
                    + toMilesPerHour(kilometersPerHour)
                    + " mi/h";
            System.out.println(output);
        }
    }

}
