public class Main {

    public static void main(String[] args) {
	    // You can use a while statement in place of a for loop
        // You will loop until a certain condition is met
        int count =1;
        while(count != 6) {
            System.out.println("count value is " + count);
            count ++;
        }

        count = 1;
        while (true) {
            if(count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // This do while is set to do the same thing as the while statement above
        // The difference is that the do while will always be executed at least once
        count =1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }
}
