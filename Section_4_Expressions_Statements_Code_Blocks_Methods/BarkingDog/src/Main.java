public class Main {

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
