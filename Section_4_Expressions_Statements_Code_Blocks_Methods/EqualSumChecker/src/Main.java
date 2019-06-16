public class Main {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1,1,2);
        hasEqualSum(1, -1, 0);
    }

    public static void hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber + secondNumber) == thirdNumber) {
            System.out.println("true");
        }
        if ((firstNumber + secondNumber) != thirdNumber) {
            System.out.println("false");
        }
    }
}
