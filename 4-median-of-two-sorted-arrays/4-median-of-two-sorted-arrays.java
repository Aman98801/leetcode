class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length+nums2.length;
        int mergedArray[] = new int[n];
        
        int count = 0;
        for(int i : nums1){
            mergedArray[count] = i;
            count++;
        }
        for(int j : nums2){
            mergedArray[count] = j; 
            count++;
        }
        Arrays.sort(mergedArray);
        
        double median = 0.0;
        if(mergedArray.length % 2 == 0){
            median = (double)(mergedArray[(n/2)-1]+mergedArray[(n/2)+1-1])/2;
        } 
        else{
           median = mergedArray[((n+1)/2)-1]; 
        } 
        
        return median;
        
    }
}