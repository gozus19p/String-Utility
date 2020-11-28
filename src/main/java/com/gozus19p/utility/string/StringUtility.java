package com.gozus19p.utility.string;

/**
 * @author Manuel Gozzi
 */
public final class StringUtility {

    public static String removeCharacter(String string, char character) {
        return null;
    }

    public static boolean isEmptyOrNull(String string) {
        return string == null || string.isEmpty();
    }

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
