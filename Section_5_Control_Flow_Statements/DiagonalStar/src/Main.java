public class Main {

    public static void main(String[] args) {
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                if (row == 0 || row == number - 1) {
                    System.out.print("*");
                    continue;
                }
                if (column == 0 || column == number -1) {
                    System.out.print("*");
                    continue;
                }
                if (row == column) {
                    System.out.print("*");
                    continue;
                }
                if (column == number - row -1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
