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

        // and operator
        int secondtopscore = 81;
        if ((topScore > secondtopscore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        // or operator
        if ((topScore > 90) || (secondtopscore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This will not work");

        // Assigning a value(wasCar) based on the evaluation of something else(isCar)
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        // Challenge
        // 1. Create a double variable with a value of 20
        double myFirstVariable = 20;
        // 2. Create a second double variable with a value of 80
        double mySecondVariable = 80;
        // 3. Add both numbers and multiply by 25
        double combinedValue = (myFirstVariable + mySecondVariable) * 25;
        // 4. Find the remainder of the combinedValue divided by 40
        double remainder = combinedValue % 40;
        // 5. Display "Total was over the limit" if remainder is equal to 20 or less
        if (remainder <= 20)
            System.out.println("Total was over the limit");





    }
}
