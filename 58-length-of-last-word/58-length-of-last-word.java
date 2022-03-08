class Solution {
    public int lengthOfLastWord(String s) {
        String sArray[] = s.split(" ");
        String sArray2[] = sArray[sArray.length-1].split("");
        return sArray2.length;
         
    }
}