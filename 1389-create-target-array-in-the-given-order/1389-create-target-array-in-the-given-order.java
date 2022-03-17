class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        if (nums.length == 1) return nums;
       List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int ptr = index[i];
            list.add(ptr,nums[i]);
        }
        
        int[] target = new int[nums.length];
        for(int j = 0; j < nums.length; j++) target[j] = list.get(j);
        
        return target;
    }
}
