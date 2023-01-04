class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            boolean x = true;
            int max = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (max < candies[j]) {
                    x = false;
                    break;
                }
            }
            res.add(x);
        }
        return res;
    }
}
