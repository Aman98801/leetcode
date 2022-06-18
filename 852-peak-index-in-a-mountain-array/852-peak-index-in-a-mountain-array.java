class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // for(int i = 0; i < arr.length-1 ; i++){
        //     if(arr[i] < arr[i+1]) continue;
        //     else return i;
        // }
        // return 0;
        
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}