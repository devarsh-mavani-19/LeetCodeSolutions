class Solution {
    public boolean check(int[] nums) {
        int mm = 0;
        for (int i = 1;i < nums.length;i++) {
            if (nums[i-1] > nums[i]) {
                mm++;
                if (mm > 1) return false;
            }
        }
        if (mm == 1) {
            return nums[nums.length-1] <= nums[0];
        }
        return true;
    }
}