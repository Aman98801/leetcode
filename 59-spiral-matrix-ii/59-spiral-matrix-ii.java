class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0;
        int down = n - 1;
        
        int left = 0;
        int right = n - 1;
        
      
        int[][] matrix = new int[n][n];
        
        int directionPtr = 0;
        int elem = 1;
        while(top <= down && left <= right){
            
            if(elem > n * n) break;
            
            if(directionPtr == 0){
                for(int i = left ; i <= right; i++){
                    matrix[top][i] = elem;
                    elem++;
                }
                top = top + 1;
            }
            else if(directionPtr == 1){
                for(int i = top; i <= down; i++){
                    matrix[i][right] = elem;
                    elem++;
                }
                right = right - 1;
            }
            
            else if(directionPtr == 2){
                for(int i = right; i >= left; i--){
                    matrix[down][i] = elem;
                    elem++;
                }
                down = down - 1;
            }
            
            else {
                  for(int i = down; i >= top; i--){
                      matrix[i][left] = elem;
                      elem++;
                  }
                left = left + 1;
            }
            
            directionPtr = ( directionPtr + 1 ) % 4;
        }
        
        return matrix;
    }
 
}