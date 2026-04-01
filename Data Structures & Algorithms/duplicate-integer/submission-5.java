class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        //base case
        if(nums.length == 0){
            return false;
        }

        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        //return boolean (none of them match)
        return false;
    }
}