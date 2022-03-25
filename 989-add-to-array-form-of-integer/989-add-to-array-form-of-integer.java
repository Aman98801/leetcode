class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
          
        List<Integer> list = new ArrayList<>();
        
        int length = num.length;
        
        while(length-- > 0 || k>0 ){
            if(length >= 0) k+= num[length];
            list.add(k%10);
            k = k/10;
        }
        
        Collections.reverse(list);
        return list;
    }
}


/*

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
          
        List<Integer> list = new ArrayList<>();
        String s="";
        
        for(int i : num){
            s = s+String.valueOf(i);   
        }
        
        long result =Long.parseLong(s)+(long)k; 
        int r = 0;
        
        while(result>0){
            r = (int)(result%10);
            list.add(r); 
            result = result/10;
        }
        
        Collections.reverse(list);
        return list;
    }
}

*/