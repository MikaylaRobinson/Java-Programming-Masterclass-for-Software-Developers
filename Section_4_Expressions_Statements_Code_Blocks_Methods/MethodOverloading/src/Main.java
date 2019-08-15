public class Main {

    // Method overloading is writing methods with the same name, but different parameters

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(75));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // Challenge using method overloading. Each method sharing a name must have different parameters
    // Make two methods that both return centimeters
    // One method will take feet and inches
    // The second should only take inches and then use the original two-parameter method
    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double feetToInches = feet * 12;
        double totalInches = feetToInches + inches;
        double centimeters = totalInches * 2.54;
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = (int) inches / 12;
        int remainderInches = (int) inches % 12;
        double centimeters = calcFeetAndInchesToCentimeter(feet,remainderInches);
        return centimeters;
    }
}
