package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiSources {

    private static Stream<Arguments> bmiSources() {
        return Stream.of(
                Arguments.of(1.65, 40, "Very severely underweight"),
                Arguments.of(1.65, 43, "Severely underweight"),
                Arguments.of(1.65, 46, "Underweight"),
                Arguments.of(1.65, 52, "Normal (healthy weight)"),
                Arguments.of(1.65, 81, "Overweight"),
                Arguments.of(1.65, 83, "Obese Class I (Moderately obese)"),
                Arguments.of(1.65, 99, "Obese Class II (Severely obese)"),
                Arguments.of(1.65, 115, "Obese Class III (Very severely obese)"),
                Arguments.of(1.65, 130, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.65, 150, "Obese Class V (Super Obese)"),
                Arguments.of(1.65, 250, "Obese Class VI (Hyper Obese)")
        );
    }
}
