class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtracking(nums, target, 0);
        return result;
    }

    public void backtracking(int[] nums, int remaining, int start){
        if(remaining == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(remaining < 0) return;

        //multiple choices so for loop, also i and not i + 1 becasue allows duplicates
        for(int i = start; i < nums.length; i++){
        //choose
        current.add(nums[i]);
        //explore
        backtracking(nums,remaining - nums[i], i);
        //undo
        current.remove(current.size() -1);
    }
    }
}
