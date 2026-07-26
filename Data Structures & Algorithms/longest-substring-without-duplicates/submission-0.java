class Solution {
    public int lengthOfLongestSubstring(String s) {

        int leftMostPositionofRepeatedCharacter = 0;
        int maximumLength = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int right=0; right < s.length(); right++){

            char c = s.charAt(right);
            if(map.containsKey(c)){
                leftMostPositionofRepeatedCharacter = Math.max(leftMostPositionofRepeatedCharacter, map.get(c) + 1);           
            }
            map.put(c,right);
            maximumLength = Math.max(maximumLength, right - leftMostPositionofRepeatedCharacter +1);
        }
        return maximumLength;
    }
}
