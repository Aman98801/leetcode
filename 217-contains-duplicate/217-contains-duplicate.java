class Solution {
    public boolean containsDuplicate(int[] nums) {
        // optimal
        
         Set<Integer> set = new HashSet<Integer>();
		 for(int i : nums)
			 if(!set.add(i))// if there is same
				 return true; 
		 return false;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         return true;
        //     }
        //     else map.put(nums[i],count);
        // }
        // return false;
    }
}