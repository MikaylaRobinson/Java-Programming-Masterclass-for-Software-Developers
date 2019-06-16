public class Main {

    public static void main(String[] args) {
        // The for loop has three parameters (initial, termination, and increment).
        // This allows us to test each value between 2 and 8 in increments of one.
        for(int i=2; i<9; i++) {
            System.out.println(calculateInterest(10000, i));
        }
        // Challenge: modify the above to do the same thing, but work backwards from 8% to 2%
        for(int i=8; i>=2; i--) {
            System.out.println(calculateInterest(10000, i));
        }

        // Challenge: create a for statement for any range of numbers
        // Use the isPrime method to determine if each number is a prime number
        // if it is a prime number, print it out and increment a count of the number of prime number found
        // if the count is 3, use break ot exit the for loop
        int count = 0;

        for (int i=1; i<14; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 3) {
                    break;
                }
            }
        }
    }
    // Prime number finder given by course instructor
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
}
