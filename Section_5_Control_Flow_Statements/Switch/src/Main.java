public class Main {

    // Both the if statement and switch statement can be interchanged based on style
    public static void main(String[] args) {
	int value = 1;
	if(value ==1) {
	    System.out.println("Value was 1");
    } else if(value ==2) {
        System.out.println("Value was 2");
    } else {
	    System.out.println("Was not 1 or 2");
    }

	int switchValue = 1;

	// Switch is an alternative to using if statements
	switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        // More that one case can be evaluated. This functions as the if and else if seen above
        case 2:
            System.out.println("Value was 2");
            break;
        // Multiple cases can be evaluated in one line
        case 3: case 4: case 5:
            System.out.println("was a 3, or a 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;
            // Default steps in for the else statement seen above
        default:
            System.out.println("Was not 1, 2, 3, or 5");
            break;
    }
    // Challenge: Create a switch statement using char that tests for A, B, C, D. or E
    char letter = 'G';
	switch(letter) {
        case 'A':
            System.out.println(" A was found");
            break;
        case 'B':
        System.out.println("B was found");
            break;
        case 'C': case 'D': case 'E':
            System.out.println(letter + "was found");
            break;
        default:
            System.out.println("Was not A, B, C, D, or E");
            break;
    }

    // Example using string type
    String month = "jaNuary";
	// Use /toLowerCase to convert your string to lower case since having January and JaNuary are different
    // Could also use /toUpperCase if cases were changed to all capital letters
	switch(month.toLowerCase()) {
        case "january":
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
    }

    }
}
