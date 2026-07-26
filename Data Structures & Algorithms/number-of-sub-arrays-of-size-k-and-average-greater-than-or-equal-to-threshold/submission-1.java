class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count=0;
        int windowSumMinimum = k*threshold;
        int currentWindowSum = 0;

        for(int i=0; i<k; i++){
            currentWindowSum += arr[i];
        }
        if(currentWindowSum >= windowSumMinimum){
            count ++;
        }

        for (int j=k; j<arr.length; j++){
            currentWindowSum += arr[j];
            currentWindowSum -= arr[j-k];
            if(currentWindowSum >= windowSumMinimum){
                count++;
            }
        }
        return count; 
    }
}