class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length()-1;
        if(len<0)
            return 0;
        
        int back=0;

        while(s.charAt(len)==' ')
            len--;
            if(len<0)
                return 0;
        
        back=len;

        while(s.charAt(len)!=' ')
        {
            len--;
            if(len<0)
                break;
        }
        return back-len;
    }
}
        
        
