class Solution {
    public void rotate(int[][] matrix) {
        // 1st Transpose of matrix
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // System.out.print(Arrays.toString(matrix[0]));
        
        // reverse
        for(int k = 0; k < matrix.length; k++){
            int start = 0;
            int end = matrix[k].length - 1;
            
            while(start <= end){
                int temp = matrix[k][start];
                matrix[k][start] = matrix[k][end];
                matrix[k][end] = temp;
                start++;
                end--;
            }
            
        }
    }
}