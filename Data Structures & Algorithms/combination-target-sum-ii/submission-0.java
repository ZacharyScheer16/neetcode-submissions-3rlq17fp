class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        backtracking(candidates, target, 0);

        return result;
    }

    public void backtracking(int[] candidates, int remaining, int start) {

        // Found a valid combination
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Overshot the target
        if (remaining < 0) {
            return;
        }

        // Multiple choices -> for loop
        for (int i = start; i < candidates.length; i++) {

            // Skip duplicates at the same recursion level
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Choose
            current.add(candidates[i]);

            // Explore (can't reuse same number)
            backtracking(candidates, remaining - candidates[i], i + 1);

            // Undo
            current.remove(current.size() - 1);
        }
    }
}