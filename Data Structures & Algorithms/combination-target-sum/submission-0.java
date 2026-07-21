class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] nums, int target) {
            backtrack(nums, target, 0);
            return result;
     }

     public void backtrack(int[] nums, int remaining, int start){
        if(remaining == 0){ 
            result.add(new ArrayList<>(current));
        return;
        }

        if(remaining < 0)return;

        //use for loop becasue we are using more than once
        for(int i = start; i < nums.length; i++){
        //choose
        current.add(nums[i]);
        //explore
        backtrack(nums, remaining - nums[i], i);
        //undo
        current.remove(current.size() - 1);
        }
     }//backtrack method
}
