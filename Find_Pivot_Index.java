class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        int CurrSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (CurrSum == sum - CurrSum - nums[i])
                return i;

            CurrSum += nums[i];
        }
        return -1;
    }
}