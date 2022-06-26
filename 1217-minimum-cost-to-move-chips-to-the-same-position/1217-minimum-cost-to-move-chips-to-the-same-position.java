class Solution {
    public int minCostToMoveChips(int[] position) {
        
       int even = 0;
       int odd = 0;
        
        for(int i : position){
            if(i % 2 == 0) odd++;
            else even++;
        }
        return Math.min(even,odd);
    }
 
}

/*
   logic :
          1. find maxVal in array
          2.  index(maxVal) even means all the even index will be               cost = 0;
          3.
*/