class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        while (k < nums.length) {
            if (nums[k] == 0) {

                break;
            } else {
                k = k + 1;
            }
        }

        int j = k + 1;
        while (j < nums.length) {
            if (nums[j]!=0) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k++;
            }
            j++;
        }
        
    }
}