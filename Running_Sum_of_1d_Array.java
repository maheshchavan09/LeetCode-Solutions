class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i - 1] + nums[i];
            nums[i] = sum;
        }
        return nums;

    }
}
