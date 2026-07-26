class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int windowSum = 0;
        int minimumRequiredSum = threshold*k;
        int count = 0;
        
        for (int i=0; i < k; i++){
            // Initialize by getting sum and average 
            windowSum += arr[i];
        }
        
        if(windowSum >= minimumRequiredSum){
            count++;
        }

        for (int j=k ; j< arr.length; j++){

            windowSum += arr[j];
            windowSum -= arr[j-k];

            if(windowSum >= minimumRequiredSum){
                count++;
            }
        }
        return count;
    }
}