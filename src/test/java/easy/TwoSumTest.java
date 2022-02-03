package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    private void setup() {
        twoSum = new TwoSum();
    }

    @Test
    public void twoSum_withSimpleArray_returnsCorrectAnswer() {
        // GIVEN
        int[] arr = {1,1};
        int target = 2;
        int[] expectedResult = {0,1};

        // WHEN
        int[] result = twoSum.twoSum(arr, target);

        // THEN
        Assertions.assertEquals(expectedResult[0], result[0],
                "Expected the 0th element to be " + expectedResult[0]);
        Assertions.assertEquals(expectedResult[1], result[1],
                "Expected the 1st element to be " + expectedResult[1]);
    }

    @Test
    public void twoSum_withComplexArray_returnsCorrectAnswer() {
        // GIVEN
        int[] arr = {4,8,15,16,23,42};
        int target = 58;
        int[] expectedResult = {3,5};

        // WHEN
        int[] result = twoSum.twoSum(arr, target);

        // THEN
        Assertions.assertEquals(expectedResult[0], result[0],
                "Expected the 0th element to be " + expectedResult[0]);
        Assertions.assertEquals(expectedResult[1], result[1],
                "Expected the 1st element to be " + expectedResult[1]);
    }

    @Test
    public void twoSum_withNoSolution_returnsNull() {
        // GIVEN
        int[] arr = {4,8,15,16,23,42};
        int target = 4;

        // WHEN
        int[] result = twoSum.twoSum(arr, target);

        // THEN
        Assertions.assertNull(result, "Expected result to be null");
    }
}
