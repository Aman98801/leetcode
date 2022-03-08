class Solution {
    public int lengthOfLastWord(String s) {
        int temp = 0;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            
            if(s.charAt(i) != ' ') temp++;
            else if(temp > 0) return temp;
        }
        return temp;
    }
}

