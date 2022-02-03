package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    public void setup() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix_withArrayLengthThree_returnsCorrectAnswer() {
        // GIVEN
        String[] arr = {"flower","flow","flight"};
        String expectedResult = "fl";

        // WHEN
        String result = longestCommonPrefix.longestCommonPrefix(arr);

        // THEN
        Assertions.assertEquals(expectedResult, result,
                "Expected the result to be " + expectedResult);
    }

    @Test
    public void longestCommonPrefix_withNoMatches_returnsEmptyString() {
        // GIVEN
        String[] arr = {"cartoon","carnivore","dog"};
        String expectedResult = "";

        // WHEN
        String result = longestCommonPrefix.longestCommonPrefix(arr);

        // THEN
        Assertions.assertEquals(expectedResult, result,
                "Expected the result to be " + expectedResult);
    }
}
