class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[101];
        
        for(int i = 0;  i < logs.length; i++){
            for(int j = logs[i][0]; j < logs[i][1]; j++){
                arr[j - 1950]++;
            }
        }
            int maxPopulationYear = 1950;
            int count = 0;

            for(int k = 0; k < 101; k++){
                if(arr[k] > count){
                    count = arr[k];
                    maxPopulationYear = k + 1950;
                }
            }
        return maxPopulationYear;
    }
}