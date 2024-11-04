package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 20
    @Test
    public void range3050Test01() {

        // Given
        int a = 30;
        int b = 31;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range3050Test02() {

        // Given
        int a = 30;
        int b = 41;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void range3050Test03() {

        // Given
        int a = 40;
        int b = 50;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.range3050(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }
    // Problem 21
    @Test
    public void compareLastDigitTest01() {

        // Given
        int a = 7;
        int b = 17;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareLastDigitTest02() {

        // Given
        int a = 6;
        int b = 17;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareLastDigitTest03() {

        // Given
        int a = 3;
        int b = 113;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.compareLastDigit(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
