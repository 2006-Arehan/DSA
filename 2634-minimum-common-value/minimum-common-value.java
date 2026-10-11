class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length ;
        int m = nums2.length;

        int left =0;
        int right =0;

        while(left<n && right <m){

        if(nums1[left]==nums2[right]){
            return nums1[left];
        }
        else if(nums1[left]<nums2[right]){
            left++;
        }
        else{
            right++;
        }
        
    }
    return -1;
    }
}