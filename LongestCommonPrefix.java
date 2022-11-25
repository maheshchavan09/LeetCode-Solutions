//Sort the string array and compare the elements of 1st and last index of string array then use substring

class Solution {
    public String longestCommonPrefix(String[] strs) {
       String arr[]=strs;
        if(arr.length==0 || arr == null) return "";
        Arrays.sort(arr);
        String res = "";
        int len = arr[0].length();
        int i=0;
        while(true) 
		{
            if(i<len && arr[0].charAt(i)== arr[arr.length-1].charAt(i))  i++;
            else break;  
         }
        return arr[0].substring(0,i);    
    }
}