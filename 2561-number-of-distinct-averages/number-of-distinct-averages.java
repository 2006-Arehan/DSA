class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;

        HashSet<Integer> set = new HashSet<>();

        while(left<right){
            set.add(nums[left]+ nums[right]);
            left++;
            right--;
            
        }
        return set.size();
        
    }
}