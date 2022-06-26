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

/*
  Logic:
          1. Take 4 pointers
             top (help to move top to down --> row changing)
             down(help to move down to top --> row changing)
             
             left (help to move left to right --> column change)
             right(help to move right to left --> column change)
             
           2. Take a direction pointer to help tell direction
           
           dirPtr = 0 means  --->   this direction
           dirPtr = 1 means  downword arrow direction
           
           dirPtr = 2 means  <--- this direction moves
           dirPtr = 3 means upword arrow direction
           
           and then we have write loops
           
      At dir = 0  1.print 1 row so range of loop[left to right]
                    row++;
             
      At dir = 1  2. Print last column element row changing    
                     column const
             
                     loop range [row to down]
                     right --;
             
      At dir = 2  3. print right to left at last row
                    
                     loop range [right to left]
                     down--;
        
      At dir = 3  4. print down to up rows
             
                     loop range [down to top]
                     left++;
                     
         At last ( dir + 1) % 4
         
            -- first  dirPtr = 0  so (0 + 1) % 4 = 0
            -- second  dirPtr = 1  so (1 + 1) % 4 = 2
            -- third  dirPtr = 2  so (2 + 1) % 4 = 3
            -- first  dirPtr = 3  so (3 + 1) % 4 = 0
            
*/