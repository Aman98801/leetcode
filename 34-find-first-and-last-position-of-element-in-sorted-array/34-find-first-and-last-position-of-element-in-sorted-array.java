class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        if(nums.length == 0){
            ans[0] = -1;
            ans[1] = -1;
            
            return ans;
        } 
        
        int count1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans[0] = i;
                break;
            }
            else ans[0] = -1;
        }
        
        int count2 = 0;
          for(int j = nums.length-1; j >= 0; j--){
            if(nums[j] == target){
                ans[1] = j;
                break;
            }
            else ans[1] = -1;
        }
        return ans;  
    }
}