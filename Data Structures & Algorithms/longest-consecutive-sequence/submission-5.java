class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int greatestStreak = 0;
        int count = 0;
        for(int num: nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int current = num;
                count = 1;

                while(set.contains(current + 1)){
                    count++;
                    current++;
                }
                greatestStreak = Math.max(count, greatestStreak);
            }

        }

        return greatestStreak;
    }//method
}
