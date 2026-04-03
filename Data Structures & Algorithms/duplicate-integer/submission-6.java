class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Input: nums = [1, 2, 3, 3]
        // step 1:  1 & 2
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums [j]){
                    return true;
                }
            }//j looop
        }//int i 
        //return bool
        return false;
    }
}