class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int revSum = 0;
        
        int length = mat.length-1;
        for(int i=0;i<mat.length;i++){
                sum = sum+mat[i][i];
            // System.out.println("sum : "+sum+" i : "+i);
            if(length != i){
                revSum = revSum + mat[i][length];
                // System.out.println("revSum : "+revSum+" i : "+i);
            }
            length--;
        }
        return sum+revSum;
    }
}