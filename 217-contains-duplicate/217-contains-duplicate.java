class Solution {
    public boolean containsDuplicate(int[] nums) {
        // optimal
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],count+1);
                return true;
            }
            else map.put(nums[i],count);
        }
        return false;
    }
}