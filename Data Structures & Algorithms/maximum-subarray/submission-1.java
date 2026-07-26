class Solution {
    public int maxSubArray(int[] nums) {
    // Thing to remember here is if the next 
    // if the currentSum less than zero then currentSum = nums[i]
    // If the previous sum is negative, it only hurts future sums, so discard it and start a new subarray:
    // 1. Have two variables currentSum, largestSum
    // 2. 

    int currentSum = 0;
    int largestSum = nums[0];
    for (int i = 0; i< nums.length; i++){
        if(currentSum < 0){
           currentSum = nums[i];
        }else{
        currentSum = currentSum + nums[i];
        }
        if(currentSum > largestSum){
            largestSum = currentSum;
        }
    } 
    return largestSum;
    }
}
