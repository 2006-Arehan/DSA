import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int element : nums1) {
            set.add(element);
        }

        for (int element : nums2) {
            if (set.contains(element)) {
                common.add(element);
            }
        }

        int[] result = new int[common.size()];
        int i = 0;

        for (int element : common) {
            result[i] = element;
            i++;
        }

        return result;
    }
}