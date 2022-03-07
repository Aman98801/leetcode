import java.util.Arrays; 

class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = Integer.MIN_VALUE;   // globalMax = -2147483648
        // System.out.println(globalMax);
        
        int localMax = 0;
        
        for (int i =0; i < nums.length; i++){
            if (localMax<0){
                localMax =  nums[i];   // localMax = -2(i=0), 1(i=1),4(i=3),
            }else{
                localMax = localMax+nums[i]; // localMax = -2(i=2),3(i=4),5(i=5),6(i=6),1(i=7),5(i=8)
            }
        // localMax= Math.max(localMax+nums[i],nums[i]);
            globalMax = Math.max(globalMax,localMax);   // -2(i=0),1(i=1),1(i=2),4(i=3),4(i=4),5(i=5),6(i=6)
                                                        //  6(i=7),6(i=8)
            }

        return globalMax;
    }
}