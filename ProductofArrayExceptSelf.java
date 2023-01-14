class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length];
        
        int totalProd = 1;
        for (int i = 0;i < nums.length;i++){
            totalProd = totalProd * nums[i];
        }
        if(totalProd != 0){
           for (int i = 0;i < nums.length;i++){
             arr[i] = totalProd/nums[i];
            } 
        }
        else {
            for (int i = 0;i < nums.length;i++){
                int prod = 1;
              for (int j = 0;j < nums.length;j++){
                  if (i != j){
                    prod = prod * nums[j];
                  }
              }
              arr[i] = prod;
            } 
        }
        return arr;
    }
}