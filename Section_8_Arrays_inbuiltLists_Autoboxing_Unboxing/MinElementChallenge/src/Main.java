import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] newArray = readIntegers();
        System.out.println("Your array: " + Arrays.toString(newArray));

        System.out.println("The minimum value in your array is: " + findMin(newArray));

    }

    public static int[] readIntegers() {
        System.out.println("Enter the desired length of your array: \r");
        int count = scanner.nextInt();
        int[] myArray = new int[count];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter position " + i + " of your array: ");
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
