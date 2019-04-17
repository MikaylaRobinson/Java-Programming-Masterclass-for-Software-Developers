public class Main {

    public static void main(String[] args) {
        // This can be one character long including unicode characters
        char myChar = 'D';
        char myUnicodeChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        // Used for true vs. false
        boolean myBoolean = false;

        // Challenge: find, assign the code to a char variable, and print the registered symbol (unicode)
        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);
    }
}
