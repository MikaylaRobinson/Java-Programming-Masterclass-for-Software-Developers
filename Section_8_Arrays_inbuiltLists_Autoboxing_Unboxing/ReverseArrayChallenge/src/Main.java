import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[] {1, 2, 3, 4, 5};
        int[] reverseArray = reverse(myArray);
        System.out.println(Arrays.toString(reverseArray));
    }

    public static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < (array.length); i++) {
            newArray[i] = array[(array.length - 1) - i];
        }
        return newArray;
    }
}
