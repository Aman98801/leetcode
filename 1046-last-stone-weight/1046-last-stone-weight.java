class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : stones) list.add(i);
        
        return Solution(list);
        
    }
    public int Solution(List<Integer> list){
        
        System.out.println(list);
        if(list.size() == 0) return 0;
        else if(list.size() == 1)return list.get(0);
        else{
            int len = list.size();
            Collections.sort(list);
            
            // System.out.println(list);
            
            int x = list.get(len-2);
            int y = list.get(len-1);
            
            if(x == y){
                list.remove(len-2);
                list.add(y-x);
                list.remove(len-2);
            }
            else{
                list.remove(len-2);
                // System.out.println(list);
                list.add(y-x);
                list.remove(len-2);
                // System.out.println(list);
            }
            
            int x1 = Solution(list);
            
            return x1;
        }
        
    }
}

/*
    if(x == y){
                list.remove(len-1);
                list.remove(len-1);
            }
            else{
               list.remove(len-1);
               y = y-x;
               list.add(len-1,y);
            }
*/