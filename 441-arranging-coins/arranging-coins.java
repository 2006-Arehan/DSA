class Solution {
    public int arrangeCoins(int n) {
        int row =1;

        for(int i =1;i<=n;i++){
            if(n>=i){
                n = n-i;
                row++;
            }else{
                break;
            }
        }
        return row -1;
        
    }
}