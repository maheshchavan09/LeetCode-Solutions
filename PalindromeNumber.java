class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder str1 = new StringBuilder(str);
        String str2 = str1.reverse().toString();

        if(str.equals(str2))
            return true;
        
        return false;
}
}