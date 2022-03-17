class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length;i++){
           int j = nums[i];
            for(int k = 1;k<nums.length;k++){
                if(j == nums[k] && i<k) n++;
            }
        }
        return n;
    }
}