/*Approach
 * Traverse the string  by giving open bracket condition and push close bracket in arr 
 * compare string char and arr char 
 */
class Solution {
    public boolean isValid(String s) {
       char arr[] = new char[s.length()];
       int count =0;
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)=='('){
                arr[count]=')';
                count++;
           }
           else if(s.charAt(i)=='['){
                arr[count]=']';
                count++;
           }
           else if(s.charAt(i)=='{'){
                arr[count]='}';
                count++;
           }
           else 
           {
               if(count==0||s.charAt(i)!=arr[--count])
                     return false;
           }
            
       }
       return count==0;
    }
}