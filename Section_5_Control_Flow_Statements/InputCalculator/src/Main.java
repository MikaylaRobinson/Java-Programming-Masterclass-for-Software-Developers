import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                System.out.println("SUM = " + sum +" " + "AVG = " + average);
                break;
            }
            int numberInput = scanner.nextInt();
            counter++;
            scanner.nextLine();
            sum += numberInput;
            average = Math.round((double) sum/counter);
        }
    }
}

