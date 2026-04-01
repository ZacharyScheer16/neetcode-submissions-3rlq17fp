class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        //establish variables in hashset
        for(int n: nums){
            set.add(n);
        }

        int maxValue = 0;


        //calculate what is next number
        for(int num: set){

            int count = 1;
            int currentNum = num;
            while(set.contains(currentNum+1)){
                count++;
                currentNum++;
            }

            maxValue = Math.max(count, maxValue);
        }
        return maxValue;

    }
}
