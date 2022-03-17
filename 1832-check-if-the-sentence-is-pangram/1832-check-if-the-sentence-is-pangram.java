class Solution {
    public boolean checkIfPangram(String sentence) {
        
        String[] str = sentence.split("");
        System.out.println(Arrays.toString(str));
        Set<String> s = new HashSet<>();
        
        for(String i : str){
            s.add(i);
        }
        if(s.size() == 26){
            return true;
        }
        return false;
    }
}