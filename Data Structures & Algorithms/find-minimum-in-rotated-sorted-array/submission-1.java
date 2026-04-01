class Solution {
    public int findMin(int[] nums) {
        //Input: nums = [3,4,5,6,1,2]
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int mid = left + (right-left)/2;
            //mid = idx [2] =5
            if(nums[mid] > nums[right]){
                left =  mid + 1;
                   //ex     5   < 6
            }else if(nums[mid] < nums[right]){
                right = mid;
            }
        }//while
    
        return nums[left];
    }
}
