public class Main {

    public static void main(String[] args) {
        // 1. byte variable. Must be within the range of -128 and 127
        byte myByteVariable = 100;

        // 2. Short variable. Must be within range of -32768 and 32767
        short myShortValue = 30000;

        // 3. Int variable. Must be within -2147483648 and 2147483647
        int myIntValue = 2000000000;

        // 4. Long variable. Must be within
        long myLongValue = 50000L + (10L * (myByteVariable + myIntValue + myShortValue));
        System.out.println(myLongValue);
    }
}
