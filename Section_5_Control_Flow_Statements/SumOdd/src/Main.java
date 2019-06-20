class Main {

    public static void main(String[] args) {
        assert (sumOdd(3, 5) == 8);
        assert (sumOdd(2, 4) == 3);
        assert (sumOdd(100, 103) == 204);
        assert (sumOdd(6, 4) == -1);
        assert (sumOdd(6, 6) == 0);
        assert (sumOdd(-1, 3) == -1);
        assert (sumOdd(-3, -2) == -1);
    }

    private static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }

    private static int sumOdd(int start, int end) {
        if (start > end || start < 0) {
            return -1;
        }

        int sum = 0;

        for (int currentNumber = start; currentNumber <= end; currentNumber++) {
            if (isOdd(currentNumber)) {
                sum += currentNumber;
            }
        }
        return sum;
    }
}
