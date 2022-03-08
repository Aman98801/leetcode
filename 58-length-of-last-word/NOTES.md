**if we want to find max length of substring then we can write this logic
**
​
Max length of subString ...
class Solution {
public int lengthOfLastWord(String s) {
String sArray[] = s.split(" ");
int max = 0;
for(int i=0;i<sArray.length;i++){
String sArray2[] = sArray[i].split("");
// System.out.println(Arrays.toString());
if(max > sArray2.length) continue;
else max = sArray2.length;
}
return max;
}
}