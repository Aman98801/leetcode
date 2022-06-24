class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i >= 10 && i <= 99) count++;
            else if(i >= 1000 && i <= 9999) count++;
            else if(i == 100000) count++;
            else continue;
        }
        return count;
    }
}