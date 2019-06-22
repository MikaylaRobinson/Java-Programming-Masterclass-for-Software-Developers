public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                System.out.println(factor);
            }
        }
    }
}
