import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("mtIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("mtIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        // Since both variables reference the same array, this change will be reflected when printing both variables
        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        System.out.println("after modify method myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify method anotherArray = " + Arrays.toString(anotherArray));

        // Dereferencing anotherArray
        anotherArray = new int[] {4, 5, 6, 7, 8};

        System.out.println("after modify method myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify method anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
