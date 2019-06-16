public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(32123));
    }

    // Challenge: Create a method that finds the sum of all digits in a given number
    // For numbers less than 10, return -1
    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        // putting this in a while loop is necessary to handle numbers with more than two digits
        while (number > 0) {
            // extracting the least significant digit
            int digit = number % 10;
            sum += digit;

            // dropping the least significant digit
            number /= 10;
        }
        return sum;

    }
}
