public class Main {

    public static void main(String[] args) {

        // addition operator
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        //subtraction operator
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        // multiplication operator
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        // division operator
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        // remainder operator
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        // increment result by one
        System.out.println("The result was: " + result);
        result++;
        System.out.println("The result is now :" + result);
        result--;
        System.out.println("The result is now: " + result);

        // increment result by two
        result += 2;
        System.out.println("The result is now: " + result);

        // multiply the result by ten
        result *= 10;
        System.out.println("The result is now: " + result);

        // subtract ten from the result
        result -= 10;
        System.out.println("The result is now: " + result);

        // divide the result by ten
        result /= 10;
        System.out.println("The result is now: " + result);

        // if/then statements: using operators in conditionals
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 101;
        if (topScore > 100)
            System.out.println("You got the high score!");


    }
}
