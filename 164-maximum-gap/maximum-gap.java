class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length - 1;
        int maxGap = 0;

        for (int i = 0; i < n; i++) {
            int currGap = nums[i + 1] - nums[i];
            maxGap = Math.max(currGap, maxGap);
        }

        return maxGap;
    }
}