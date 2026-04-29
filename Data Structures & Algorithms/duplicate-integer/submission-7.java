class Solution {
    public boolean hasDuplicate(int[] nums) {
        //hashset to check if duplicate macthes
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;

        //standard for loop
        for(int i = 0; i < length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        //if all passes then we know true
        return false;
    }
}