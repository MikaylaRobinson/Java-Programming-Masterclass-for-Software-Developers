public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    private static boolean ageIsTeen(int age) {
        return (age >= 13 && age <= 19);
    }

    private static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return ageIsTeen(firstAge)
                || ageIsTeen(secondAge)
                || ageIsTeen(thirdAge);
    }
}
