import static org.junit.Assert.*;

// This is the testing class using Junit4 following along with the challenges
public class UtilitiesTest {

    // Setting up an instance of the utilities class that can be accessed by all tests
    private Utilities utilities;

    // The .Before tag indicates this will run before any of the tests
    // This eliminates the need to create another instance of the utilities
    // class for every test
    @org.junit.Before
    public void setupUtilities() {
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() throws Exception {
        // Testing a general case with the expected outcome
        char [] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        // Testing when n is greater than the length of the array
        char [] output2 = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 12);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'},output2);
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        // Testing variations of possible inputs
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        // Testing what happens when there are more than 2 duplicates in a row
        assertEquals("A", utilities.removePairs("AAA"));
        // When the input is only one character long
        assertEquals("A", utilities.removePairs("A"));
        // When the input is null
        assertNull(null, utilities.removePairs(null) );

    }

    @org.junit.Test
    public void converter() throws Exception {
        // Confirming operations work as expected
        assertEquals(300, utilities.converter(10, 5));
    }

    // Handling division by 0 for converter
    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmetic_exception() throws Exception {
        utilities.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        // When length of input is odd
        assertNull(utilities.nullIfOddLength("ABCDE"));
        // When length of input is even
        assertNotNull(utilities.nullIfOddLength("ABCD"));
    }
}