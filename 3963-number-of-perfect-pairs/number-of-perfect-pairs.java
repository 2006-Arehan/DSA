class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long ans =0;
        int j =0;

        for(int i =0;i<n;i++){
            while(j<n && nums[j]<=2L*nums[i]){
                j++;
            }
            ans+= (j-i-1);
        }
        return ans ;

        
    }
}