public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!(isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber))) {
            return false;
        }

        int lastDigitOne = firstNumber % 10;
        int lastDigitTwo = secondNumber % 10;
        int lastDigitThree = thirdNumber % 10;

        return (lastDigitOne == lastDigitTwo || lastDigitOne == lastDigitThree || lastDigitTwo == lastDigitThree);
    }

    public static boolean isValid(int number) {
        return !(number < 10 || number > 1000);
    }
}
