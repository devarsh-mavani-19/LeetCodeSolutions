class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentValue = 0;
        for (int i = 0;i < nums.length;i++) {
            currentValue += nums[i];
            if (currentValue > maxSoFar) {
                maxSoFar = currentValue;
            }
            if (currentValue < 0) currentValue = 0;
        }
        return maxSoFar;
    }
}