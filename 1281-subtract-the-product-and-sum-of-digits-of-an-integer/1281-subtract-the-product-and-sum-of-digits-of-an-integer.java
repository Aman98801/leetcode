class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, mul = 1, r;
        
        while(n > 0){
            r = n % 10;
            sum = sum+r;
            mul = mul * r;
            n = n / 10;
        }
        
        return (mul - sum);
        
        
    }
}