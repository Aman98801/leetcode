class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>(); // taking row 0 index
        List<Integer> col = new ArrayList<>(); // taking col 0 index
        
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        setZero(matrix,row,col); // now setting up zeros
    }
   public void setZero(int[][] matrix,List<Integer> row,List<Integer> col){
      // first in rows we are setting up zeros
       
       for(int i = 0; i < row.size(); i++){
           int rowNo = row.get(i);
           for(int j = 0; j < matrix[0].length;j++){
               matrix[rowNo][j] = 0;
           }
       }
       
       // for column 
       for(int k = 0; k < col.size(); k++){
           int colNo = col.get(k);
           for(int j1 = 0; j1 < matrix.length;j1++){
               matrix[j1][colNo] = 0;
           }
       }
   }
}