class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length+1];
            altitude[0] = 0;
        
        int sum = 0;
        
        int index = 1;
        int _max = 0;
        for(int i : gain){
            sum = sum + i;
            altitude[index] = sum;
            _max = Math.max(_max,sum);
            index++;    
        }  
        // System.out.println(Arrays.toString(altitude));
        return _max;
    }
}