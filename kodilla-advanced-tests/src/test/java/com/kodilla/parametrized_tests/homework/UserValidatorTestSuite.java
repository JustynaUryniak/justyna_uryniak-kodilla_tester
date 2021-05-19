package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"qWe", "1235", "._q2T-", "T6.y"})
    public void shouldReturnTrueIfUsernameIsCompatibile(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"We", "123hd,", "._q2Tż-", "T6.$y", "@!q#"})
    public void shouldReturnFalseIfUsernameIsNotCompatibile(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void shouldReturnFalseIfUsernameIsEmptyOrHasOnlySpaces(String username) {
        assertFalse(validator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Ws02-_@gmail.coM", "AAA@GMAIL.m", "abcde@Gma-il.ABCDEF", "1234@123.abcdef"})
    public void shouldReturnTrueIfEmailIsCompatibile(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ws02-_@1#,;.coM", "A&$!%#(),@GMAIL.m", "abcde@Gma-il.ABCDEFG", "1234@123."})
    public void shouldReturnFalseIfEmailIsNotCompatibile(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsEmpty(String email) {
        assertFalse(validator.validateEmail(email));
    }
}