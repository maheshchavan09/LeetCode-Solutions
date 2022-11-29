class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=nums1.length-1;
       int p1=m-1;
       int p2=n-1;

       while(p2>=0)
       {
           if(p1<0||nums2[p2]>=nums1[p1])
           {
               nums1[i]=nums2[p2];
               p2--;
           }
           else
           {
               nums1[i]=nums1[p1];
               p1--;
           }
           i--;
       }
    }
}    

