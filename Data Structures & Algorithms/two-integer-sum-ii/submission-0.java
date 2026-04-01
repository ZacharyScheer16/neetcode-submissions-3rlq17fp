class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Input: numbers = [2,7,11,15], target = 9
        //Output: [1,2]


        int left = 0;
        int right = numbers.length -1;

        while(left < right){

            int currentSum = numbers[left] + numbers[right];

            if(currentSum == target){
                return new int[] {left +1, right+1 };
            }

            if(currentSum > target){
                right--;
            }

            if(currentSum < target){
                left++;
            }

            }

        return new int[]  {0,0};
    }
}
