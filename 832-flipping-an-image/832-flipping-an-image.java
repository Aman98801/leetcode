class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int reverseArray[][] = new int[image.length][];
        int count = 0;
      for(int subArray[] : image){
          
          // fliping array logic means Array reverse.....
          
          int start=0; int end = subArray.length-1;
          while(start <= end){
              int temp = subArray[start];
              subArray[start] = subArray[end];
              subArray[end] = temp;   
              start++;
              end--;
          }
          
          // inverting image logic means 1 --> 0  && 0 ---> 1
          for(int j=0;j<subArray.length;j++){
              if(subArray[j] == 1) subArray[j] = 0;
              else subArray[j] = 1;
          }
          
          
          reverseArray[count]= subArray;
          count++; 
      }
        return reverseArray;
    }
}