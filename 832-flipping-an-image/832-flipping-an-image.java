class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int invertArray[][] = new int[image.length][];
        int count = 0;
      for(int subArray[] : image){
          
          
          int start=0; int end = subArray.length-1;
          while(start <= end){
              int temp = subArray[start];
              subArray[start] = subArray[end];
              subArray[end] = temp;   
              start++;
              end--;
          }
          
          for(int j=0;j<subArray.length;j++){
              if(subArray[j] == 1) subArray[j] = 0;
              else subArray[j] = 1;
          }
          
          
          invertArray[count]= subArray;
          count++; 
      }
        return invertArray;
    }
}