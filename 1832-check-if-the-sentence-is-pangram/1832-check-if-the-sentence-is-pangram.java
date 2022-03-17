
// 2nd logic ..
class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        if(sentence.length() < 26) return false;
        
        for(int i = 0; i < 26; i++) {
            if(sentence.indexOf(alphabet.charAt(i)) == -1) return false;
        }
        return true;
    }
}



// class Solution {
//     public boolean checkIfPangram(String sentence) {
        
//         char[] str = sentence.toCharArray();
//         // System.out.println(Arrays.toString(str));
//         Set<Character> s = new HashSet<>();
        
//         for(char i : str){
//             s.add(i);
//         }
//         if(s.size() == 26){
//             return true;
//         }
//         return false;
//     }
// }

