package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {
    private MaximumSubarray maximumSubarray;

    @BeforeEach
    public void setup() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void maxSubArray_withMultipleArrays_returnsCorrectSolution() {
        // GIVEN
        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        int expectedResult1 = 6;
        int[] arr2 = {1};
        int expectedResult2 = 1;
        int[] arr3 = {5,4,-1,7,8};
        int expectedResult3 = 23;

        // WHEN
        int result1 = maximumSubarray.maxSubArray(arr1);
        int result2 = maximumSubarray.maxSubArray(arr2);
        int result3 = maximumSubarray.maxSubArray(arr3);

        // THEN
        Assertions.assertEquals(expectedResult1, result1,
                "Expected the result to be " + expectedResult1);
        Assertions.assertEquals(expectedResult2, result2,
                "Expected the result to be " + expectedResult2);
        Assertions.assertEquals(expectedResult3, result3,
                "Expected the result to be " + expectedResult3);
    }

}
