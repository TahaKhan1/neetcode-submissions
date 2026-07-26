class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 1. two pointers: left and right
        // 2. for loop with right pointer
        // 3. Check using while loop to check value to target 
        // 4. Remove left index value and then compare with target
        // 5. Remove left index again if target is 
        int left = 0;
        int minimumLength = Integer.MAX_VALUE;
        int currentSum = 0;
        for (int right=0; right < nums.length; right++){
            currentSum += nums[right];
            while(currentSum >= target){
                  minimumLength = Math.min(minimumLength, right - left+1);
                  currentSum -= nums[left]; 
                  left++;
                  System.out.println("right: "+ right);
                  System.out.println("left: "+ left);
            }
        }
        if (minimumLength == Integer.MAX_VALUE){
            return 0;
        }else{
            return minimumLength;
        }
    }
}