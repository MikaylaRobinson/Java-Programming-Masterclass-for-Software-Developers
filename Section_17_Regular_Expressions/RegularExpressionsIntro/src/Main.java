import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a string. Yes, I am";
        System.out.println(string);

        // Replacing string that matches parameter passed
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        // Replacing all characters
        String alphanumeric = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        // Carrot boundary matcher. Carrot indicates you are looking for
        // matching characters at the start of the string.
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        // A second occurrence of "abcDeee" will be unaffected.
        // The parameter defines it will only be changed at the beginning of the string.
        String secondAlphanumeric = "abcDeeeF12abcDeeeGhhiiiiijkl99z";
        System.out.println(secondAlphanumeric.replaceAll("^abcDeee", "YYY"));

        // matches: returns boolean when checking if strings match
        // This returns false as expected.
        System.out.println(alphanumeric.matches("^hello"));
        // This also returns false because matches is checking for a match as a whole.
        // You must pass in the entire string for true to be returned.
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiiijkl99z"));

        // Dollar sign boundary matcher checks for a match at the end of the string.
        System.out.println(alphanumeric.replaceAll("jkl99z$", "THE END"));

        // Replacing all occurrences of more than one character
        // This formatting will replace all occurrences of either a, e, or i/
        System.out.println(alphanumeric.replaceAll("[aei]", "x"));

        // Replacing any occurrences of the character if they are followed by F or j.
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        // These give the same output because the regex is looking
        // for upper or lower case.
        System.out.println("Harry".replaceAll("[Hh]arry", "Hank"));
        System.out.println("harry".replaceAll("[Hh]arry", "Hank"));
        // You can also use the or operator (|) to do this same thing
        System.out.println("harry".replaceAll("[H|h]arry", "Hank"));

        // Replacing everything except a desired few
        // Within square brackets the carrot indicates
        // the pattern that will remain in the string
        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));

        // Replacing everything within number or letter ranges
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));
        // This example also displays that regex is case sensitive
        // To include the capital letters, you must also specify those versions
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));

        // Turning off case sensitivity
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        // Replacing all numbers can be done two ways
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X"));

        // Replacing all non-digits
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        // Replacing white space
        String hasWhiteSpace = "I have blanks and \ta tab, and also a newLine\n";
        // This replaces all whitespace regardless of location in the string
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        // This replaces only the tab
        System.out.println(hasWhiteSpace.replaceAll("\t","X"));

        // This is also a way to remove everything but the white space
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));

        // Shortcut for replacing all a-z, A-Z, 0-9, and _
        System.out.println(alphanumeric.replaceAll("\\w", "X"));

        // Looking for word boundaries, assuming all words are separated by whitespace.
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));


        // Quantifiers
        String thirdAlphanumeric = "abcDeeeF12abcDeeeGhhiiiiijkl99z";
        // Quantifiers allow us to only define e once instead of "eee"
        System.out.println(thirdAlphanumeric.replaceAll("^abcDeee", "YYY"));
        // The {3} defines the desired number of the preceding character
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe{3}", "YYY"));

        // Plus Quantifier looks for one or more of the preceding character
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe+", "YYY"));

        // looks for the string followed by 0 or more of the last character
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe*", "YYY"));

        // Specifying minimum and maximum allowable for a character
        // Will only be replaces if there are between 2 and 5 e's
        System.out.println(thirdAlphanumeric.replaceAll("^abcDe(2,5)", "YYY"));

        // This will replace strings with one or more h, one or more i, followed by a j
        System.out.println(thirdAlphanumeric.replaceAll("h+i+j", "Y"));

        // Matcher looking for html tags
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph that I write.</p>");
        htmlText.append("<p>This is a paragraph that I also write.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>This is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        // Showing character ranges of the h2 tag locations
        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        // Looking for the h2 tags and anything in between
        // We need to use a lazy quantifier that will find the least amount
        // of characters to be a match. This will find only the first h2.
        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.*?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        String tvTest = "tstvtkt";
        // Looking for t that is not followed by v
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
    }
}
