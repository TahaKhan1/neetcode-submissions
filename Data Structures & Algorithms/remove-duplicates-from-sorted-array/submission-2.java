class Solution {
    public int removeDuplicates(int[] nums) {
        // in this problem
        // we keep the left pointer where our duplicate value is found

        int left = 1;
        for (int right=1; right < nums.length; right++){
            if(nums[right] != nums[right-1]){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}