
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        Set<Double> s = new HashSet<>();
        while(start<end)
        {
            double d = (nums[start]+nums[end])/2.0;
            s.add(d);
            start++;
            end--;
        }

        return s.size();
    }
}