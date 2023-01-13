class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int range = nums[nums.length - 1] + nums[0];
        int m = 0;
        for (int i = 1; i < range; i++) {
            if (nums[0] % i == 0 && nums[nums.length - 1] % i == 0)
                m = i;
        }
        return m;
    }
}