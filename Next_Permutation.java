class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int leftpart = 0;
        int rightpart = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                leftpart = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[leftpart]) {
                rightpart = i;
                break;
            }
        }

        if (leftpart == rightpart) {
            Arrays.sort(nums);
            return;
        } else {
            int temp = nums[leftpart];
            nums[leftpart] = nums[rightpart];
            nums[rightpart] = temp;

            int left = leftpart + 1;
            int right = n - 1;
            while (left < right) {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                left++;
                right--;
            }
        }
    }
}