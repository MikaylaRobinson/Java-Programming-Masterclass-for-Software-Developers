public class Main {

    public static void main(String[] args) {
        // Challenge
	    // Create a method called isEvenNumber that takes in an int
        // It then determines if the number is even or not
        // return true for even, false for odd
        // Create a while statement that will print each even number, up to five
        // Once 5 have been found, break and print a count of even numbers found
        int i =4;
        int finishNumber = 20;
        int count = 0;

        while (i <+ finishNumber) {
            i++;
            if(!isEvenNumber(i)) {
                continue;
            }
            System.out.println("Even number " + i);
            count++;
            if(count >= 5) {
                System.out.println("Total even numbers found: " + count);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
