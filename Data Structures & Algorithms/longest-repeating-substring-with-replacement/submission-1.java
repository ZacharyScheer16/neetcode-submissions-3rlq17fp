class Solution {
    public int characterReplacement(String s, int k) {
        int maxResult = 0;
        int maxFreq = 0;
        int[] count = new int [26];
        int start = 0;

        for(int i =0; i < s.length(); i++){
            int idx = s.charAt(i) - 'A';
            count[idx]++;
            
            maxFreq = Math.max(maxFreq, count[idx]);

            while((i -start +1) - maxFreq> k){
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxResult = Math.max(maxResult, i - start + 1);


        }// for loop
        return maxResult;
    }
}



