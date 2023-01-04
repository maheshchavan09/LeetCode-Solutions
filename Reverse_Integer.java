class Solution {
    public int reverse(int x) {
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        int result = 0;
        int check = 0;
        while (x > 0) {
            int mod = x % 10;
            result = 10 * result + mod;

            if ((result - mod) / 10 != check)
                return 0;

            check = result;
            x = x / 10;
        }

        if (isNegative) {
            result = -result;
        }
        return result;
    }
}