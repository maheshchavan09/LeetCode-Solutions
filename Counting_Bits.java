class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int a = i;
            while (a > 0) {
                if (a % 2 == 1) {
                    count++;
                }
                a = a / 2;
            }
            ans[i] = count;
        }
        return ans;

    }
}