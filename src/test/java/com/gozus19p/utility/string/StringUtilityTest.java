package com.gozus19p.utility.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Manuel Gozzi
 */
public class StringUtilityTest {

    @Test
    public void removeCharacter() {
    }

    @Test
    public void isEmptyOrNull() {
        String empty = "";
        Assert.assertTrue(StringUtility.isEmptyOrNull(empty));

        Assert.assertTrue(StringUtility.isEmptyOrNull(null));

        String notempty = "hello world!";
        Assert.assertFalse(StringUtility.isEmptyOrNull(notempty));

        String onlyWhiteSpaces = "    ";
        Assert.assertFalse(StringUtility.isEmptyOrNull(onlyWhiteSpaces));
    }

    @Test
    public void containsOnlyWhitespace() {
    }

    @Test
    public void containsWhitespace() {
    }

    @Test
    public void endsWith() {
    }
}