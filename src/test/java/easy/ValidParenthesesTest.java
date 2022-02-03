package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    public void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void isValid_withOneValidParenthesis_returnsTrue() {
        // GIVEN
        String s = "()";

        // WHEN
        boolean result = validParentheses.isValid(s);

        // THEN
        Assertions.assertTrue(result, "Expected '()' to return true");
    }

    @Test
    public void isValid_withValidParentheses_returnsTrue() {
        // GIVEN
        String s = "()[]{}";

        // WHEN
        boolean result = validParentheses.isValid(s);

        // THEN
        Assertions.assertTrue(result, "Expected '()[]{}' to return true");
    }

    @Test
    public void isValid_withInvalidParentheses_returnsFalse() {
        // GIVEN
        String s = "(]";

        // WHEN
        boolean result = validParentheses.isValid(s);

        // THEN
        Assertions.assertFalse(result, "Expected '(]' to return false");
    }

    @Test
    public void isValid_withMultipleValidParentheses_returnsTrue() {
        // GIVEN
        String s = "((([[[{{{}}}]]])))";

        // WHEN
        boolean result = validParentheses.isValid(s);

        // THEN
        Assertions.assertTrue(result, "Expected '((([[[{{{}}}]]])))' to return true");
    }
}
