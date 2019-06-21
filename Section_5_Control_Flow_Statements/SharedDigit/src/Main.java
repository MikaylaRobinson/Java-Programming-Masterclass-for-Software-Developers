public class Main {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
            return false;
        }

        int secondDigitFirstNumber = firstNumber % 10;
        int secondDigitSecondNumber = secondNumber % 10;
        firstNumber /= 10;
        int firstDigitFirstNumber = firstNumber % 10;
        secondNumber /= 10;
        int firstDigitSecondNumber = secondNumber % 10;

        if (firstDigitFirstNumber == firstDigitSecondNumber || firstDigitFirstNumber == secondDigitSecondNumber || secondDigitFirstNumber == firstDigitSecondNumber || secondDigitFirstNumber == secondDigitSecondNumber) {
            return true;
        }
        return false;
    }
}
