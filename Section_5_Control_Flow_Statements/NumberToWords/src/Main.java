public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverse = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverse);
        String numberInWord = "";
        for (int i = 0; i < originalDigitCount; i++) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            numberInWord += " ";
            reverse /= 10;
        }
        System.out.println(numberInWord);
    }

    public static int reverse(int input) {
            int result = 0;

            while(input != 0) {
                int digit = input % 10;
                result *= 10;
                result += digit;
                input /= 10;
            }
            return result;
        }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        int digitCount = 0;

        do  {
            number /= 10;
            digitCount ++;
        } while (number != 0);

        return digitCount;
    }


    }

