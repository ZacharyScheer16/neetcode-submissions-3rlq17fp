class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window problem

        int maxLength = 0;
        int left =0;
        HashSet<Character> set = new HashSet<>();
    
        
        for(int r =0; r < s.length(); r++){
            char current = s.charAt(r);

            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLength = Math.max(maxLength, r - left + 1);
        }
        
        return maxLength;
    }
}
