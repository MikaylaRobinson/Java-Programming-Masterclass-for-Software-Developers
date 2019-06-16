public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        // How to change a string to an integer using parse int method
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        // Testing if the change was successful by doing a mathematical operation on both
        numberAsString += 1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
