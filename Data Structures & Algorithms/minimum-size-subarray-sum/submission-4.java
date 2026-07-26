class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Window //
        int currentWindowSum = 0;
        int minimumWindowSize = Integer.MAX_VALUE;
        int left = 0;
        for (int right=0; right < nums.length; right++){
            currentWindowSum += nums[right];
            // Check with Minimum Window Size
            while(currentWindowSum >= target){ 
                minimumWindowSize = Math.min(minimumWindowSize, right - left + 1);
                currentWindowSum = currentWindowSum - nums[left];
                left++;
            }
        }
    return minimumWindowSize == Integer.MAX_VALUE ? 0 : minimumWindowSize;
}}