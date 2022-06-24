// Optimized code
​
class Solution {
public int[] sumZero(int n) {
int[] arr = new int[n];
for(int i = 1; i < n; i++) {
arr[0] -= arr[i] = i;
}
return arr;
}
}
​
​
Apporoach but not successful :
​
// class Solution {
//     public int[] sumZero(int n) {
//         int[] result = new int[n];
//         int x = n/2;
//         for(int i=0;i<result.length;i++){
//             if(x%2==0){
//                 if(i<x)result[i] = x-(x+1);
//                 else{
//                     result[i] = x;
//                     x--;
//                     n--;
//                 }
//             }
//             else{
//                 result[x] = 0;
//                 if(i<x && i!=x)
//                 result[i] = x-(x+1);
//                 else{
//                     result[i] = x;
//                     x--;
//                 }
//             }
//         }
//         return result;
//     }
// }