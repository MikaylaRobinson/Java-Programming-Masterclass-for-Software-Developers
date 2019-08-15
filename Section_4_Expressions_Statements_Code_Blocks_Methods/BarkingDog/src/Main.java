public class Main {

    // Coding exercise 3 in course. Letting you know if you should wake up
    // at night if the dog is barking. Wake up if the dog is barking before 8 or
    // after 22 hours (return true)
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("false");
            return;
        }

        if (hourOfDay < 8 || hourOfDay > 22) {
            System.out.println(barking);
            return;
        }

        System.out.println("false");
    }
}
