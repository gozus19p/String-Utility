package com.gozus19p.utility.string;

import com.gozus19p.utility.FullyTested;

/**
 * @author Manuel Gozzi
 */
public final class StringUtility {

    private static final String NULL_POINTER_OF_REMOVE = "Trying to remove a character from null String instance";

    @FullyTested
    public static String remove(String string, char characterToRemove, boolean ignoreCase) {
        if (isEmptyOrNull(string))
            throw new NullPointerException(NULL_POINTER_OF_REMOVE);

        return ignoreCase ? remove(
                remove(
                        string,
                        Character.toUpperCase(characterToRemove)
                ),
                Character.toLowerCase(characterToRemove)
        ) : remove(string, characterToRemove);
    }

    public static String remove(String string, char characterToRemove) {

        if (isEmptyOrNull(string))
            throw new NullPointerException(NULL_POINTER_OF_REMOVE);

        return string.replace(characterToRemove+"", "");
    }

    @FullyTested
    public static boolean isEmptyOrNull(String string) {
        return string == null || string.isEmpty();
    }

    @FullyTested
    public static boolean containsOnlyWhitespace(String string) {
        if (isEmptyOrNull(string)) {
            return false;
        }
        byte[] characters = string.getBytes();
        for (byte character : characters) {
            if (!Character.isWhitespace((char) character))
                return false;
        }
        return true;
    }

    @FullyTested
    public static boolean containsWhitespace(String string) {
        if (isEmptyOrNull(string)) {
            return false;
        }
        for (byte character : string.getBytes()) {
            if (Character.isWhitespace((char) character))
                return true;
        }
        return false;
    }

    @FullyTested
    public static boolean endsWith(String string, String endingString, boolean ignoreCase) {
        if (isEmptyOrNull(string) || isEmptyOrNull(endingString)) {
            return false;
        }
        return ignoreCase ? endsWith(string.toLowerCase(), endingString.toLowerCase())
                : endsWith(string, endingString);
    }

    @FullyTested
    public static boolean endsWith(String string, String endingString) {
        if (isEmptyOrNull(string) || isEmptyOrNull(endingString)) {
            return false;
        }
        int stringLength = string.length(), endingStringLength = endingString.length();
        if (endingStringLength > stringLength) {
            return false;
        }
        if (endingStringLength == stringLength) {
            return string.equals(endingString);
        }
        String substring = string.substring(
                stringLength - endingStringLength
        );
        return substring.equals(endingString);
    }

}
