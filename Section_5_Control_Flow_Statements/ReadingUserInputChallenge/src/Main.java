import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creating the instance of scanner
        Scanner scanner = new Scanner(System.in);

        // Set the counter for entered numbers to 1 to begin
        int numberToBeEntered = 1;
        // Set the sum of all entered numbers to begin at 0
        int sum = 0;

        // Set the inputs to loop until there have been 10 numbers entered
        while (numberToBeEntered <= 10) {
            System.out.println("Please enter number #" + numberToBeEntered + ": ");

            // Confirm the number entered is an integer
            boolean hasNextInt = scanner.hasNextInt();

            // To be executed if an integer was entered
            if (hasNextInt) {
                // Using .nextInt to retrieve the integer input with our instance of scanner
                int enteredNumber = scanner.nextInt();
                // Add this entered number to the running sum
                sum += enteredNumber;
                // Edit the number being requested
                numberToBeEntered++;
            } else {
                System.out.println("Invalid number");
            }

            // Keeping the nextLine here allows for another input when something other than an integer is entered
            scanner.nextLine(); // This keeps scanner from bypassing the enter name input due to enter key

            // Print the sum only if there have been 10 successful entries
            if (numberToBeEntered > 10) {
                System.out.println("sum = " + sum);
            }
        }
        // Close scanner once we no longer need this instance
        scanner.close();
    }
}
