class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        int n = nums.length;

        //double for loop
        for(int i =0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[]  {i,j};
                }
            }//for j
        }//for i
        return new int[] {0,0};
    }//method
}//class
