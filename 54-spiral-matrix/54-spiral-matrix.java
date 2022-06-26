class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int top = 0;    // pointing to first row
        int down = matrix.length - 1;   // pointing to last row
        
        int left = 0;  // pointing to first column
        int right = matrix[0].length - 1; // pointing to last column.
        
        return spiralAlgo(matrix,top,down,left,right);
    }
    public List<Integer> spiralAlgo(int[][] matrix,int top,int down,int left,int right){
    
        List<Integer> list = new ArrayList<>();
        int directionPtr = 0;
        
        while(top <= down && left <= right){
            
        if(directionPtr == 0){    
             for(int i = left; i <= right; i++){
              list.add(matrix[top][i]);
             }
             top = top + 1;
        }
        else if(directionPtr == 1){
            for(int i = top; i <= down; i++){
                list.add(matrix[i][right]);
            }
            right = right - 1;
        }
        else if(directionPtr == 2){
            for(int i = right; i >= left; i--){
                list.add(matrix[down][i]);
            }
            down = down - 1;
        }
        else{
            for(int i = down; i >= top; i--){
                list.add(matrix[i][left]);
            }
            left = left + 1;
        }
        
          // increment directionPtr for every step 
            directionPtr = (directionPtr + 1) % 4;
     }
     return list;
       
   }
}