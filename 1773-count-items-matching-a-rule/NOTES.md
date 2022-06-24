Concept : Change 2d list to Array
​
String[][] arr = new String[items.size()][];
int i = 0;
for (List<String> l: items) {
System.out.println(i);
arr[i++] = l.toArray(new String[l.size()]);
}
// solution
class Solution {
public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
int index = -1;
switch(ruleKey){
case "type" : index=0; break;
case "color" : index=1;break;
case "name" : index=2; break;
}
int count = 0;
for(List<String> l : items){
if(l.get(index).equals(ruleValue))
count++;
}
return count;
}
}
​