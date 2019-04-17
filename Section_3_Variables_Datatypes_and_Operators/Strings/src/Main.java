public class Main {

    public static void main(String[] args) {
	    // A string is a sequence of characters
        String myString = "This is a string";
        System.out.println(myString);

        // You can alter your string variables
        myString = myString + ", and this is adding more";
        System.out.println(myString);

        // When set as a string, numbers are treated as text
        // This results in "250.5549.95" not addition
        String numberString = "250.55";
        numberString = numberString + "49.95";

        // In this situation, java will treat the integer as a string
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

    }
}
