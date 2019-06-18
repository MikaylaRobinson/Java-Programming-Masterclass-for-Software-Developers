public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (isLeapYear(year) == true && month == 2) {
            return 29;
        }
        if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 28;
            }
        }
        return -1;
    }
}
