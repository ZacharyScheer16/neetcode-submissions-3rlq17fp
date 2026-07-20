class Solution {
    //result
    List<List<Integer>> result = new ArrayList<>();

    //backtracking Array List
    ArrayList<Integer> subset = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return result;
    }

    public void backtracking(int[] nums, int idx){
        //base case
        if(nums.length == idx){
            result.add(new ArrayList<>(subset));
            return;
        }
        
        //choose 
        subset.add(nums[idx]);

        //explore
        backtracking(nums, idx + 1);

        //undo
        subset.remove(subset.size() - 1);

        //try another choiuce
        backtracking(nums, idx + 1);

    }
}
