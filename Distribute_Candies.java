class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s = new HashSet<Integer>();
        int max = candyType.length / 2;

        for (int a : candyType)
            s.add(a);

        if (s.size() > max)
            return max;
        else
            return s.size();

    }
}