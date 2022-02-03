package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    private void setup() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void romanToInt_withSimpleRoman_returnsCorrectInt() {
        // GIVEN
        String roman = "I";
        int expectedResult = 1;

        // WHEN
        int result = romanToInteger.romanToInt(roman);

        // THEN
        Assertions.assertEquals(expectedResult, result, "Expected " + roman + " to be " + expectedResult);
    }

    @Test
    public void romanToInt_withAllRomanCharacters_returnsCorrectInt() {
        // GIVEN
        String roman = "MMDCCLXXVII";
        int expectedResult = 2777;

        // WHEN
        int result = romanToInteger.romanToInt(roman);

        // THEN
        Assertions.assertEquals(expectedResult, result, "Expected " + roman + " to be " + expectedResult);
    }

    @Test
    public void romanToInt_withSimpleSubtraction_returnsCorrectInt() {
        // GIVEN
        String roman = "IV";
        int expectedResult = 4;

        // WHEN
        int result = romanToInteger.romanToInt(roman);

        // THEN
        Assertions.assertEquals(expectedResult, result, "Expected " + roman + " to be " + expectedResult);
    }

    @Test
    public void romanToInt_withComplexSubtraction_returnsCorrectInt() {
        // GIVEN
        String roman = "CDXCIX";
        int expectedResult = 499;

        // WHEN
        int result = romanToInteger.romanToInt(roman);

        // THEN
        Assertions.assertEquals(expectedResult, result, "Expected " + roman + " to be " + expectedResult);
    }

    @Test
    public void romanToInt_withEmptyString_returnsZero() {
        // GIVEN
        String roman = "";
        int expectedResult = 0;

        // WHEN
        int result = romanToInteger.romanToInt(roman);

        // THEN
        Assertions.assertEquals(expectedResult, result, "Expected " + roman + " to be " + expectedResult);
    }

    @Test
    public void romanToInt_withNullValue_returnsZero() {
        // GIVEN
        String roman = null;
        int expectedResult = 0;

        // WHEN
        int result = romanToInteger.romanToInt(roman);

        // THEN
        Assertions.assertEquals(expectedResult, result, "Expected " + roman + " to be " + expectedResult);
    }
}
