import javax.swing.text.Position;

public class Main {

    public static void main(String[] args) {
        int score = 800;

        // The if statement determines which code block to run depending on the specified conditions
        // The code blocks are within the brackets {}
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        // Using else if and else allow you to test against multiple conditions
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Winner");
        }

        // This is an example of calling a method
        int highScore = calculateScore(true, 800,5,100);
        System.out.println("Your final score was " + highScore);
        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition();

    }
    // This is my method that I can use above with varying parameters
    // This keeps me from needing to duplicate this code to do this calculation more than once
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore; }
        return -1;
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;}
        }

}
