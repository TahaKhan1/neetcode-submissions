class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        // threshold, k 
        int minimumThresholdValue = threshold*k;
        int windowSum=0;
        int arrayCount = 0;

        for (int i=0; i<k; i++){
            windowSum += arr[i];
        }

        if(windowSum >= minimumThresholdValue){
            arrayCount++;
        }

        for (int j=k; j< arr.length; j++){
            windowSum += arr[j];
            windowSum = windowSum - arr[j-k];
            if(windowSum >= minimumThresholdValue){
                arrayCount++;
            }
        }
        return arrayCount;
    }   
}
