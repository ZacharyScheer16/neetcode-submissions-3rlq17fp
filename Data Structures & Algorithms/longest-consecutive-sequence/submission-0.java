class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int longestStreak = 0;

        for(int num: set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int streak = 1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    streak++;
                }
                longestStreak = Math.max(longestStreak, streak);
            }
        }
        return longestStreak;
    }
}
