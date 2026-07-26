class Solution {
    public int maxSubArray(int[] nums) {
        // Memorization // 
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++){
            currentSum = currentSum + nums[i];
            if(currentSum < nums[i]){
                currentSum = nums[i];
            }
            maximumSum = Math.max(currentSum, maximumSum);
        } 
        return maximumSum;
    }
}
