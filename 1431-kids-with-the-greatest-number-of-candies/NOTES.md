​
class Solution {
public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
List<Boolean> list = new ArrayList<>();
for(int i = 0; i < candies.length ; i++){
int sumCandie = candies[i] + extraCandies;
int count = 0;
for(int j = 0; j < candies.length;j++){
if(sumCandie >= candies[j]) count++;
}
if(count == candies.length) list.add(true);
else list.add(false);
}
return list;
}
}