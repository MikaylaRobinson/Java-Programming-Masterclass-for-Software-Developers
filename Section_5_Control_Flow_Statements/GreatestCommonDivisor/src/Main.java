public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int min = Math.min(first, second);
        int max = Math.max(first, second);
        int greatestDivisor = 0;

        for (int divisor = 1; divisor <= min; divisor++) {
            if (min % divisor == 0 && max % divisor == 0) {
                if (divisor > greatestDivisor) {
                    greatestDivisor = divisor;
                }
                }
        }
        return greatestDivisor;
    }
}

