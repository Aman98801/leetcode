class Solution {
    public void reverseString(char[] s) {
     
    /*
      int start = 0;
      int end = s.length-1;
        
        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
         for(char i : s){
            System.out.println(i);
        }
        */
        
        // second logic 
        
        String s1 = "";
        for(int i=0;i<s.length;i++){
            String s2 = Character.toString(s[i]);
            s1+=s2;
        }
        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sb1 = sb.reverse();
        String str[] = sb1.toString().split("");
        
        String s3 = "";
        for(int i=0;i<s.length;i++){
           s3+=str[i];
        }
        
        char[] result = s3.toCharArray();
        for(int i=0;i<s.length;i++){
           s[i] = result[i];
        }
        
        
    }
    
}