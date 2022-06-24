class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                
                int elem = matrix[i][j];
                
                 int min =  checkMin(elem,matrix,i);
                 int max = checkMax(elem,matrix,i,j);
            
                 if(min == max){
                     list.add(min);
                 }   
            }
           
        }
       
       return list;
    }
    public int checkMin(int elem,int[][] matrix,int row){
        for(int i = 0; i < matrix[row].length; i++){
            elem = Math.min(elem,matrix[row][i]);
        }
        return elem;
    }
    
    public int checkMax(int elem,int[][] matrix,int row,int col){
        for(int i = 0; i < matrix.length; i++){
            elem = Math.max(elem,matrix[i][col]);
        }
        return elem;
    }
}