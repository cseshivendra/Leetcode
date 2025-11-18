public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If currentSum is negative, restart from current number
            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum = currentSum + nums[i];

            // Update maxSoFar
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }

        return maxSoFar;
    }
}
