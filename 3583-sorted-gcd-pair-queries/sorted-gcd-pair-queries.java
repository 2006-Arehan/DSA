class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int mx = 0;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }

        int[] freq = new int[mx + 1];
        for (int num : nums) {
            freq[num]++;
        }

        
        long[] cntDiv = new long[mx + 1];
        for (int g = 1; g <= mx; g++) {
            for (int k = g; k <= mx; k += g) {
                cntDiv[g] += freq[k];
            }
        }

   
        long[] exact = new long[mx + 1];
        for (int g = mx; g >= 1; g--) {
            long count = cntDiv[g];
            exact[g] = count * (count - 1) / 2;

            for (int k = g + g; k <= mx; k += g) {
                exact[g] -= exact[k];
            }
        }

        
        long[] prefix = new long[mx + 1];
        for (int g = 1; g <= mx; g++) {
            prefix[g] = prefix[g - 1] + exact[g];
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            answer[i] = lowerBound(prefix, queries[i] + 1);
        }

        return answer;
    }

    private int lowerBound(long[] arr, long target) {
        int left = 1;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

