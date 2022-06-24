class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index  = -1;
        switch(ruleKey){
            case "type" -> index = 0;
            case "color"-> index = 1;
            case "name" -> index = 2;
        }
        
        int count = 0;
        
        for(List<String> list : items){
         if(list.get(index).equals(ruleValue)) count++;
        }
        return count;
    }
}