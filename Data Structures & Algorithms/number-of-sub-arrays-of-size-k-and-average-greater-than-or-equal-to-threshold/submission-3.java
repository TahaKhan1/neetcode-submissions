class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int minThreshold = k*threshold;
        int count = 0;
        int currentSum = 0;
        for (int i=0; i < k; i++){
            currentSum += arr[i];
        }
        if(currentSum >= minThreshold){
            count++;
        }
        for (int j=k; j < arr.length; j++){
            currentSum = currentSum + arr[j] - arr[j-k];
            if(currentSum >= minThreshold){
                count++;
            }
        }
    return count;  
    }
}