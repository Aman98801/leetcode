class Solution {
    public int findNumbers(int[] nums) {
        int totalEvenDigit = 0;
        for(int i=0;i<nums.length;i++){

            int count = 0;
            while(nums[i]> 0) {
                nums[i] = nums[i]/10;  
                count++;
            }
            if(count % 2 == 0) totalEvenDigit++;
        }
        return totalEvenDigit;
    }
}

/*
  Simple logic
  
  Very Simple
10-99 ---- EVEN digit
1000-9999 --- EVEN digit
100000 -- EVEN digit

class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;
        
        for(int i =0 ; i< nums.length; i++){
            
if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        
        return count;
        
    }
}

*/