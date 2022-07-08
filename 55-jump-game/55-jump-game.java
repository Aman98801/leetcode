class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int maxValue = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(maxValue < i) return false;
            maxValue = Math.max(maxValue, i + nums[i]);
        }
        return true;
    }
}