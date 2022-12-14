class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> h = new HashMap<>();
        for(int i=0;i<names.length;i++)
        {
            h.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int n = heights.length-1;
        for(int i=0;i<names.length;i++)
        {
            names[i] = h.get(heights[n]);
            n--;
        }
        return names;        
    }
}