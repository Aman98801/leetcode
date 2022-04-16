class Solution {
    public boolean isMonotonic(int[] A) {
        int asc=1;
        int dec=1;
        for(int i=1; i<A.length; i++){
            if(A[i] - A[i-1] > 0)
                asc++;
            else if(A[i] - A[i-1] < 0)
                dec++;
            else {
                asc++; dec++;
            }
                
        }
        return asc == A.length || dec == A.length;
    }
}