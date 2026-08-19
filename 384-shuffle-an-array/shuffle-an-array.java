import java.util.*;

class Solution {

    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] arr = nums.clone();

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}