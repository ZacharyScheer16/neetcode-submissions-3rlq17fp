class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Input: nums = [1,2,4,6]
        int n = nums.length;
        int[] result = new int [n];
        
        result[0] = 1;

        //left
        for(int i =1; i < n; i++){
            result[i] = nums[i - 1] * result[i-1];
        }

        //end of loop above  should look like [1,1,2, 8]

        int  right = 1;
        for(int j = n -1; j >= 0; j--){
            result[j] = right * result[j];
            //iteration 1 = [1,1,2,8] ---> iteration 2 = 
            right = right * nums[j];
        }

        return result;
        





        //output Output: [48,24,12,8]
    }
}  
