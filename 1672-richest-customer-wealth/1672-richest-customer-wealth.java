class Solution {
    public int maximumWealth(int[][] accounts) {
       int maxWealth = 0;
        
        for(int[] i : accounts){
            int sum  = 0;
            for(int j : i) sum += j;
            
            maxWealth = Math.max(sum,maxWealth);
        }
        return maxWealth;
    }
}