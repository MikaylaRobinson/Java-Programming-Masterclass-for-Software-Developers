public class Main {

    public static void main(String[] args) {
    }

    public static boolean isPalindrome(int input)
    {
        int normalizedInput = input;
        if (normalizedInput < 0)
        {
            normalizedInput *= -1;
        }

        return (reverseNumber(normalizedInput) == normalizedInput);
    }

    public static int reverseNumber(int input) {

        int result = 0;

        while(input > 0) {
            int digit = input % 10;
            result *= 10;
            result += digit;
            input /= 10;
        }
        return result;
    }
}
