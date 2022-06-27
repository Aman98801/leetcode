class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        
        int product = 1;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
            else product = product * nums[i];
            
        }
        if(count == 0){
            for(int i = 0; i < nums.length; i++){
                ans[i] = product / nums[i];
            }
        }
        if(count == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0) ans[i] = product;
                else ans[i] = 0;
            }
        }
        if(count > 1){
            for(int i = 0; i < nums.length; i++){
                ans[i] = 0;
            }
        }
        
        return ans;
    }
}

/*
   Time Complexity : O(n^2) logic
   
    
        for(int i = 0; i < nums.length; i++){
            
            int temp = nums[i];
            int product = 0;
            
            for(int j = 0; j < nums.length;j++){
                if(i != j){
                product = product * nums[j];
              }
            }
            ans[i] = product;
        }
  
*/