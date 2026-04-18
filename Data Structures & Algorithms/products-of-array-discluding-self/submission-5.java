class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length - 1;
        int[] result = new int[n +1];
        
        result[0] = 1;
        //left multiplication logic
        for(int i =1; i <= n; i++){
            result[i] = result[i-1] * nums[i-1];
        }//for loop

        int right = 1;
        for(int i =n; i >= 0; i--){
            result[i] = result[i] * right ;
            right= right * nums[i];
        }
        return result;
    }
}