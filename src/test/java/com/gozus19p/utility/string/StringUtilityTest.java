package com.gozus19p.utility.string;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Manuel Gozzi
 */
public class StringUtilityTest {

    @Test
    public void remove() {

        String first = "simple string";
        assertEquals("imple tring", StringUtility.remove(first, 's'));
        assertEquals("simple string", StringUtility.remove(first, 'z'));

        try {
            StringUtility.remove(null, 'z');
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
            assertEquals("Trying to remove a character from null String instance", e.getMessage());
        }

    }

    @Test
    public void remove_ignoreCase() {

        String first = "simple string";
        assertEquals("imple tring", StringUtility.remove(first, 's', false));
        assertEquals("simple string", StringUtility.remove(first, 'z', false));

        try {
            StringUtility.remove(null, 'z', true);
            fail();
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
            assertEquals("Trying to remove a character from null String instance", e.getMessage());
        }

        assertEquals("imple tring", StringUtility.remove(first, 'S', true));
        assertEquals("simple string", StringUtility.remove(first, 'z', true));

    }

    @Test
    public void isEmptyOrNull() {
        String empty = "";
        assertTrue(StringUtility.isEmptyOrNull(empty));

        assertTrue(StringUtility.isEmptyOrNull(null));

        String notempty = "hello world!";
        assertFalse(StringUtility.isEmptyOrNull(notempty));

        String onlyWhiteSpaces = "    ";
        assertFalse(StringUtility.isEmptyOrNull(onlyWhiteSpaces));
    }

    @Test
    public void containsOnlyWhitespace() {

        String withWhitespaces = "hello world whitespace";
        assertFalse(StringUtility.containsOnlyWhitespace(withWhitespaces));

        String withNoWhitespaces = "helloworldnowhitespace";
        assertFalse(StringUtility.containsOnlyWhitespace(withNoWhitespaces));

        String onlyWhitespaces = "\t  \n\r  ";
        assertTrue(StringUtility.containsOnlyWhitespace(onlyWhitespaces));

        String onlyWhitespaces2 = "    ";
        assertTrue(StringUtility.containsOnlyWhitespace(onlyWhitespaces2));

    }

    @Test
    public void containsWhitespace() {

        // Declarations
        String withWhitespaces = "hello world whitespace";
        String withNoWhitespaces = "helloworldnowhitespace";
        String onlyWhitespaces = "\t  \n\r  ";
        String onlyWhitespaces2 = "    ";

        // Asserts
        assertTrue(StringUtility.containsWhitespace(withWhitespaces));
        assertFalse(StringUtility.containsWhitespace(withNoWhitespaces));
        assertTrue(StringUtility.containsWhitespace(onlyWhitespaces));
        assertTrue(StringUtility.containsWhitespace(onlyWhitespaces2));

    }

    @Test
    public void endsWith() {

        // Declarations
        String first = "first test case";

        // Asserts
        assertTrue(StringUtility.endsWith(first, "case"));
        assertFalse(StringUtility.endsWith(first, "first"));
        assertFalse(StringUtility.endsWith(first, "this is a string larger than \"first\""));
        assertFalse(StringUtility.endsWith(first, null));
        assertFalse(StringUtility.endsWith(null, first));
        assertFalse(StringUtility.endsWith(first, "Case"));

    }

    @Test
    public void endsWith_ignoreCase() {

        // Declarations
        String first = "first test case";

        // Asserts
        assertTrue(StringUtility.endsWith(first, "case", true));
        assertFalse(StringUtility.endsWith(first, "first", true));
        assertFalse(StringUtility.endsWith(first, "this is a string larger than \"first\"", true));
        assertFalse(StringUtility.endsWith(first, null, true));
        assertFalse(StringUtility.endsWith(null, first, true));
        assertTrue(StringUtility.endsWith(first, "Case", true));

        assertTrue(StringUtility.endsWith(first, "case", false));
        assertFalse(StringUtility.endsWith(first, "first", false));
        assertFalse(StringUtility.endsWith(first, "this is a string larger than \"first\"", false));
        assertFalse(StringUtility.endsWith(first, null, false));
        assertFalse(StringUtility.endsWith(null, first, false));
        assertFalse(StringUtility.endsWith(first, "Case", false));

    }
}