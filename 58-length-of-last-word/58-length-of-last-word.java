class Solution {
    public int lengthOfLastWord(String s) {
        String sArray[] = s.split(" ");    // first convert string into Array
        String sArray2[] = sArray[sArray.length-1].split("");  
        // convert last string into array
        return sArray2.length; // returning the length of last.
         
    }
}
