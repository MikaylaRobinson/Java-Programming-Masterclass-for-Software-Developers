import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // Challenge 1
        // Write the string literal regular expression that will match
        // the following string. Use the String.matches method to verify your
        // answer.
	    String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        // Challenge 2
        // Write a regular expression that will match "I want a bike."
        // and "I want a ball."
        String challenge2 = "I want a ball.";
        String challenge2regex = "(I want a .*)";
        System.out.println(challenge1.matches(challenge2regex));
        System.out.println(challenge2.matches(challenge2regex));
        // Also can be done like this:
        String regex = "I want a \\w+.";
        System.out.println(challenge1.matches(regex));
        System.out.println(challenge2.matches(regex));
        // Also can be done like this:
        String regexBallOrBike = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regexBallOrBike));
        System.out.println(challenge2.matches(regexBallOrBike));

        // Challenge 3
        // Rework challenge 2 to use Matcher.matches() instead of
        // using the same regex twice.
        Pattern challenge3Pattern = Pattern.compile(challenge2regex);
        Matcher challenge3Matcher = challenge3Pattern.matcher(challenge1);
        System.out.println(challenge3Matcher.matches());
        challenge3Matcher = challenge3Pattern.matcher(challenge2);
        System.out.println(challenge3Matcher.matches());

        // Challenge 4
        // Replace all occurrences of blank with an underscore
        // for the following string. Print the resulting string.
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));

        // Challenge 5
        // Write a regular expression that will match the following string
        // in its entirety.
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));

        // Challenge 6
        // Write a regular expression that will only match the challenge 5 string.
        String challenge6RegEx = "^aaabccccccccdddefffg$";
        System.out.println(challenge5.matches(challenge6RegEx));

        // Challenge 7
        // Write a regular expression that will match a string that starts
        // with a series of letters. The letters must be followed by a period.
        // After the period, there must be a series of digits.
        // Use the following string as a test.
        String challenge7 = "abcd.135";
        String regex7 = "^[a-z][A-z]+\\.[0-9]+$";
        System.out.println(challenge7.matches(regex7));

        // Challenge 8
        // Modify the regular expression in challenge 7 to use a group, so
        // that we can print all the digits that occur in a string that
        // contains multiple occurrences of the pattern. Use the following
        // String as a test.
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String regex8GroupPattern = "([a-z][A-z]+)(\\.)([0-9]+)";
        Pattern challenge8Pattern = Pattern.compile(regex8GroupPattern);
        Matcher challenge8GroupMatcher = challenge8Pattern.matcher(challenge8);
        while (challenge8GroupMatcher.find()) {
            System.out.println("Occurrence: " + challenge8GroupMatcher.group(3));
        }

        // Challenge 9
        // Redo challenge 8 with this new string.
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        challenge9 = challenge9.replaceAll("\\s", "");
        String regex9GroupPattern = "([a-z][A-z]+)(\\.)([0-9]+)";
        Pattern challenge9Pattern = Pattern.compile(regex9GroupPattern);
        Matcher challenge9GroupMatcher = challenge9Pattern.matcher(challenge9);
        while (challenge9GroupMatcher.find()) {
            System.out.println("Occurrence: " + challenge9GroupMatcher.group(3));
        }

        // Challenge 10
        // from challenge 9, instead of printing out the numbers,
        // print their indices.
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex10GroupPattern = "[A-Za-z]+\\.([0-9]+)\\s";
        Pattern challenge10Pattern = Pattern.compile(regex10GroupPattern);
        Matcher challenge10GroupMatcher = challenge10Pattern.matcher(challenge10);
        while (challenge10GroupMatcher.find()) {
            System.out.println("Start = " + challenge10GroupMatcher.start(1) + " end = " + (challenge10GroupMatcher.end(1) - 1));
        }

        // Challenge 11
        // Extract what is in the curly braces only
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern challenge11Pattern = Pattern.compile("\\{(.+?)\\}");
        Matcher challenge11Matcher = challenge11Pattern.matcher(challenge11);
        while (challenge11Matcher.find()) {
            System.out.println("Occurrences: " + challenge11Matcher.group(1));
        }

        // Challenge 12
        // Write a regular expression that will match a 5-digit US zip code
        // Use "11111" as the test
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^[0-9]{5}$"));

        // Challenge 13
        // Zip codes can also be followed by a dash and four more numbers.
        // Write a regular expression to match those zip codes with
        // 11111-1111 to test
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^[0-9]{5}-[0-9]{4}$"));

        // Challenge 14
        // Write a regex to match both types of zip codes from above
        String challenge14RegEx = "^[0-9]{5}(-[0-9]{4})?";
        System.out.println(challenge12.matches(challenge14RegEx));
        System.out.println(challenge13.matches(challenge14RegEx));
    }
}
