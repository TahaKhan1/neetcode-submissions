class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          HashMap<Integer, Integer> map = new HashMap();
        for (int right=0; right<nums.length; right++){
            // Store the position of elements 
            if(map.containsKey(nums[right]) && right - map.get(nums[right]) <= k){
                return true;
            }
            map.put(nums[right],right);
        }
        return false; 
    }
}