package easy;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int maxUpToThisPoint = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxUpToThisPoint = Math.max(maxUpToThisPoint + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxUpToThisPoint);
        }

        return maxSoFar;
    }
}
