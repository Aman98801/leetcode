class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1;
        
        switch(ruleKey){
            case "type" : index=0; break;     
            case "color" : index=1;break;
            case "name" : index=2; break;                      
        }
        
        int count = 0;
        
        for(List<String> l : items){
            if(l.get(index).equals(ruleValue))
                count++;
        }
        return count;
}
}

/*

class Solution {
   public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     int count = 0;
     
       for(List<String> l : items){
             if(ruleKey.equals("type") && ruleValue.equals(l.get(0)))
                count++;
             else if(ruleKey.equals("color") && ruleValue.equals(l.get(1)))
                     count++;
             else if(ruleKey.equals("name") && ruleValue.equals(l.get(2)))
                     count++;
             else continue; 
        }
          return count;
    }
}
     
*/