class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     String[][] arr = new String[items.size()][];
        int i = 0;
        for (List<String> l: items) {
            System.out.println(i);
            arr[i++] = l.toArray(new String[l.size()]);   
        }
        
        int count = 0;
        
        for(int j=0;j<arr.length;j++){
           
                if(ruleKey.equals("type") && ruleValue.equals(arr[j][0])){
                   count++;
                } 
                else if(ruleKey.equals("color") && ruleValue.equals(arr[j][1])){
                    count++;
                    // System.out.println(" key = color : count : "+count);
                } 
                else if(ruleKey.equals("name") && ruleValue.equals(arr[j][2])){
                      count++;
                      // System.out.println(" key = name : count : "+count);
                }
                else continue;  
        } 
        return count;
}
}