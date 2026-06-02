class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //we know the array is sorted and this is potentially telling me two pointer 
        //we will have a left and right start and end
        int left = 0;
        int right = numbers.length -1;

        //if sum > then targ, output
        while(left < right){
            int sum = numbers[left] + numbers[right]; //check sum
            if(sum == target) {return new int[] {left + 1, right + 1};}
            else if(sum > target){right--;}
            else{left++;} 
    }
        //no answer found
        return new int[] {0,0};
    }
}
