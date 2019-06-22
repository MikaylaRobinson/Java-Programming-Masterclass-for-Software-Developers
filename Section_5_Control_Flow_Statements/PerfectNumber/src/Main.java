public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
