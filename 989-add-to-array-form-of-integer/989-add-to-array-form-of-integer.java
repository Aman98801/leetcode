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


