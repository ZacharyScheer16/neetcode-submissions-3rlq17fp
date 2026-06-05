class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int currentLength = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();

        while(r < s.length()){
            char c = s.charAt(r);
            
            //if substring has repeating char
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }

            //keep adding
            set.add(c);
            longest = Math.max(longest, r - l + 1);
            r++;
        }
        return longest;
    }
}
