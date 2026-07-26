class Solution {
    public int maxArea(int[] heights) {
    // Heights 
    int maxArea = 0;
    int currentWindowArea = 0;
    int currentMininum = 0;
    int left = 0;
    int right = heights.length-1;
        while(left < right){
            int currentMinimum =  Math.min(heights[left], heights[right]);
            currentWindowArea = currentMinimum*(right-left);
            if(currentMinimum == heights[left]){
                left++;
            }else{
                right--;
            }
            maxArea = Math.max(currentWindowArea, maxArea);
        }
        return maxArea;
    }
}
