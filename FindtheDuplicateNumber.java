//Sort and iterate thea array and give the condition to compare with the next
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return 0;
    }
}
