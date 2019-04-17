public class Main {

    public static void main(String[] args) {
        // int only gives whole numbers
        int myIntValue = 5 / 3;

        // float gives 7 digits of precision past the decimal point
        float myFloatValue = 5f / 3f;

        // double gives 16 digits of precision past the decimal point
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        // result = 1

        System.out.println("myFloatValue = " + myFloatValue);
        // result = 1.6666666

        System.out.println("myDoubleValue = " + myDoubleValue);
        // result = 1.6666666666666667

        // Challenge: convert a given number of pounds to kilograms
        double myPounds = 2d;
        double myKilograms = myPounds * 0.45359237d;
        System.out.println(myKilograms);
    }
}
