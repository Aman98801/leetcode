class Solution {
public int[] smallerNumbersThanCurrent(int[] nums) {
int[] ans = new int[nums.length];
for(int i=0;i<nums.length;i++){
int count=0;
for(int j=0;j<nums.length;j++){
if(nums[i] > nums[j] && j!=i) count++;
}
ans[i] = count;
}
return ans;
}
}
​
​
**// correct solution**
class Solution {
public int[] smallerNumbersThanCurrent(int[] nums) {
int copyArray[] = nums.clone();
System.out.println(Arrays.toString(copyArray));
int[] ans = new int[nums.length];
Arrays.sort(nums);
for(int i=0;i<nums.length;i++){
ans[i] = Arrays.asList(nums).indexOf(copyArray[i]);
}
return ans;
}
}
​
// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
//         int[] ans = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i] > nums[j] && j!=i) count++;
//             }
//             ans[i] = count;
//         }
//         return ans;
//     }
// }