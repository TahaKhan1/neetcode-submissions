class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globalMaximum = nums[0];
        int globalMinimum = nums[0];
        int currentMaximum = 0;
        int currentMinimum = 0;
        int total = 0;

        for (int i= 0; i < nums.length; i++){
            currentMaximum = Math.max(nums[i], currentMaximum + nums[i]);
            currentMinimum = Math.min(nums[i], currentMinimum + nums[i]);

            total = total + nums[i];

            globalMaximum = Math.max(globalMaximum, currentMaximum);
            globalMinimum = Math.min(globalMinimum, currentMinimum);
        }
        if(globalMaximum>0){
                return Math.max(globalMaximum, total - globalMinimum);
            }else{
                return globalMaximum;
            }
    }
}