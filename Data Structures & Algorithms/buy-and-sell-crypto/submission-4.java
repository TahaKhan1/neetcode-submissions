class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int currentDifference = 0;
        int maxDifference = Integer.MIN_VALUE;
        for (int right=1; right<prices.length; right++){

            if(prices[right] < prices[left]){
                left=right;
            }
            currentDifference = prices[right] - prices[left];
            maxDifference = Math.max(currentDifference, maxDifference);
            
        }
        if(maxDifference > 0){
            return maxDifference;
        }else{
            return 0;
        }
    }
}
