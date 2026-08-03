class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mostRecentRepetitiveCharacterPosition = 0;
        int maxLength = 0;
        HashMap <Character, Integer> map = new HashMap<Character, Integer>();
        for (int right = 0; right < s.length(); right++){
                if(map.containsKey(s.charAt(right))){       
mostRecentRepetitiveCharacterPosition = Math.max(mostRecentRepetitiveCharacterPosition, map.get(s.charAt(right)));
                }
                map.put(s.charAt(right), right+1);
                maxLength = Math.max(maxLength, right - mostRecentRepetitiveCharacterPosition+1);
            
        }
        return maxLength;
    }
}
