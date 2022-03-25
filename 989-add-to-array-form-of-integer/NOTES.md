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