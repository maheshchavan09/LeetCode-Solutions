class Solution {
    public int similarPairs(String[] words) {
        int n = words.length;
        Set<Character>set1,set2=new HashSet<>();
        int count =0;
        for(int i=0;i<n-1;i++)
        {
            set1 = new HashSet<Character>();
            for(char c:words[i].toCharArray())
            {
                set1.add(c);
            }
        
            for(int j=i+1;j<n;j++)
            {   
                set2 = new HashSet<Character>();
                for(char c:words[j].toCharArray())
                    set2.add(c);
                
                if(set1.equals(set2))
                count++;
            }
            
        }
        return count;
    }
}