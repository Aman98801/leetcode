// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int ans[] = new int[2*n];
//         for(int i=0;i<nums.length;i++){
//             if(i % 2 == 0){
//                 ans[i] = nums[i];
//             }
//             else{
//                 ans[i] = nums[i+n];
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[n+i];
        }
        return ans;
    }
}