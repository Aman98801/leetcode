class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for(int i = 1; i < n; i++) {
            arr[i] = i;
            arr[0] = arr[0]- arr[i];
        }
        return arr;
    }
 }