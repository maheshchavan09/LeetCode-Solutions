class Solution {
    public int[] findArray(int[] pref) {
        int res[] = pref;
        int x = pref[0];
        for (int i = 1; i < pref.length; i++) {
            res[i] = x ^ pref[i];
            x = x ^ res[i];
        }
        return res;
    }

}