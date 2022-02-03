package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;

    @BeforeEach
    private void setup() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void palindromeNumber_withRealPalindromeNumber_returnsTrue() {
        // GIVEN
        int numberUnderTest = 1221;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertTrue(result, "Expected " + result + " to be true");
    }

    @Test
    public void palindromeNumber_withRealPalindromeNumberOddDigits_returnsTrue() {
        // GIVEN
        int numberUnderTest = 121;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertTrue(result, "Expected " + result + " to be true");
    }

    @Test
    public void palindromeNumber_withZero_returnsTrue() {
        // GIVEN
        int numberUnderTest = 0;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertTrue(result, "Expected " + result + " to be true");
    }

    @Test
    public void palindromeNumber_withNegativeNumber_returnsFalse() {
        // GIVEN
        int numberUnderTest = -1221;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertFalse(result, "Expected " + result + " to be false");
    }

    @Test
    public void palindromeNumber_withNonPalindromeNumber_returnsFalse() {
        // GIVEN
        int numberUnderTest = 1222;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertFalse(result, "Expected " + result + " to be false");
    }

    @Test
    public void palindromeNumber_withMaximumInt_returnsFalse() {
        // GIVEN
        int numberUnderTest = Integer.MAX_VALUE;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertFalse(result, "Expected " + result + " to be false");
    }

    @Test
    public void palindromeNumber_withMinimumInt_returnsFalse() {
        // GIVEN
        int numberUnderTest = Integer.MIN_VALUE;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertFalse(result, "Expected " + result + " to be false");
    }

    @Test
    public void palindromeNumber_withMultipleOfTen_returnsFalse() {
        // GIVEN
        int numberUnderTest = 1234560;

        // WHEN
        boolean result = palindromeNumber.palindromeNumber(numberUnderTest);

        // THEN
        Assertions.assertFalse(result, "Expected " + result + " to be false");
    }
}
