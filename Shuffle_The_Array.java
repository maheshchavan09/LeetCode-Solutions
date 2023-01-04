class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[2 * n];
        int start = 0;
        int end = n;
        int i = 0;
        while (start <= n - 1 && end <= 2 * n - 1) {
            res[i] = nums[start];
            res[i + 1] = nums[end];
            start++;
            end++;
            i = i + 2;
        }

        return res;
    }
}
