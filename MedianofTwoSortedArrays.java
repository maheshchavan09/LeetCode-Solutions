//Two sorted arrays merge into one and from the resultant array length find median
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a = nums1.length;
        int b = nums2.length;

        int temp[] = new int[a+b];
        int i=0;
        int j=0;
        int k=0;

        while(i<a && j<b)
        {
            if(nums1[i]<nums2[j])
            {
                temp[k++]=nums1[i++];
            }
            else
            {
                temp[k++]=nums2[j++];
            }
        }

        while(i<a)
        {
            temp[k++]=nums1[i++];
        }

        while(j<b)
        {
            temp[k++]=nums2[j++];
        }

        int len = temp.length;
        
        if(len%2==0)
             return (temp[len/2] + temp[len/2 -1])/2.0;
        else
            return  temp[len/2];
        
    }
}