import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner is a built in class that allow for reading user input
        Scanner scanner = new Scanner(System.in);

        // Asking user for birth year to calculate current age
        System.out.println("Enter your year of birth:");

        // This confirms if the next value entered is an integer
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            // Using .nextInt to retrieve the integer input with our instance of scanner
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // This keeps scanner from bypassing the enter name input due to enter key

            System.out.println("Enter your name: ");
            // Using our instance of scanner to read a line of input from the console
            // Using .nextLine to retrieve the string
            String name = scanner.nextLine();

            // Calculating age
            int age = 2019 - yearOfBirth;
            // Confirming the year entered was valid before output to user
            if(age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        // Close scanner once we no longer need this instance
        scanner.close();
    }
}
