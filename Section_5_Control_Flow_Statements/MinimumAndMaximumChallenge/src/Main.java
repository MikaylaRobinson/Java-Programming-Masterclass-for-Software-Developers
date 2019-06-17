import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumberEntered = 0;
        int minNumberEntered = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");

            // Confirm the number entered is an integer
            boolean isAnInt = scanner.hasNextInt();

            // To be executed if an integer was entered
            if (isAnInt) {
                // Retrieve the integer input with our instance of scanner
                int enteredNumber = scanner.nextInt();

                // Sets the min and the max both to the first value entered.
                // This fixes the bug where two numbers above zero are entered,
                // so the minimum remains zero incorrectly
                if(first) {
                    first = false;
                    minNumberEntered = enteredNumber;
                    maxNumberEntered = enteredNumber;
                }
                if(enteredNumber > maxNumberEntered) {
                    maxNumberEntered = enteredNumber;
                }
                if(enteredNumber < minNumberEntered) {
                    minNumberEntered = enteredNumber;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Minimum: " + minNumberEntered);
        System.out.println("Maximum: " + maxNumberEntered);
        scanner.close();
    }
}
