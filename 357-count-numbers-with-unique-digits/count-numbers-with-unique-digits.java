class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int ans = 10;
        int available = 9;
        int unique = 9;

        for(int digit =2;digit<=n  && available > 0;digit++){
            unique*=available;
            ans+= unique;
            available--;
        }
        
        return ans;
    }
}