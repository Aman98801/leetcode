class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        // list print
        for(List<String> l : items){
             if(ruleKey.equals("type") && ruleValue.equals(l.get(0))){
                   count++;
                } 
                
             else if(ruleKey.equals("color") && ruleValue.equals(l.get(1))){
                    count++;
                    // System.out.println(" key = color : count : "+count);
                } 
             else if(ruleKey.equals("name") && ruleValue.equals(l.get(2))){
                      count++;
                      // System.out.println(" key = name : count : "+count);
                }
                else continue;  
        }
        return count;
}
}