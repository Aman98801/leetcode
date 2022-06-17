class Solution {
    public int subtractProductAndSum(int n) {
        int x = productOfDigits(n);
        int y = sumOfDigits(n);
        
        return x-y;
    }
    public int productOfDigits(int n){
        int product = 1;
        
        while(n > 0){
            product = product*(n % 10);
            n = n/10;
        }
        return product;
    }
    public int sumOfDigits(int n){
        int sum = 0;
        
        while(n > 0){
            sum = sum + (n % 10);
            n = n /10;
        }
        return sum;
    }
}