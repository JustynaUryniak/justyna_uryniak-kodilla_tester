package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/howManyWinsCase.csv", numLinesToSkip = 1)
    public void shouldReturnSetWithCorrectSize(Integer number1, Integer number2, Integer number3, Integer number4,Integer number5, Integer number6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

        int result = machine.howManyWins(numbers);

        assertTrue(result >=0 && result <=6);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/howManyWinsCase.csv", numLinesToSkip = 1)
    public void shouldReturnSetWithNotCorrectSize_withException(Integer number1, Integer number2, Integer number3, Integer number4,Integer number5, Integer number6, Integer number7) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        numbers.add(number7);

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers), "Wrong numbers provided");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/howManyWinsCase.csv", numLinesToSkip = 1)
    public void shouldReturnSetWithTooSmallSize_withException(Integer number1, Integer number2, Integer number3, Integer number4,Integer number5) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers), "Wrong numbers provided");
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/validateNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnExceptionIfIncorrectData(Integer number1, Integer number2, Integer number3, Integer number4, Integer number5,  Integer number6) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);

        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers), "Wrong numbers provided");
    }
}