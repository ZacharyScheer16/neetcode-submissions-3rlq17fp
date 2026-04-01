class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Create bucket
        List<Integer>[] bucket = new List[nums.length + 1];

        // Initialize ALL buckets
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // Fill bucket
        for (int num : map.keySet()) {
            int freq = map.get(num);
            bucket[freq].add(num);
        }

        int[] result = new int[k];
        int idx = 0;

        // Traverse bucket from high freq to low
        for (int i = bucket.length - 1; i > 0 && idx < k; i--) {
            for (int num : bucket[i]) {
                result[idx++] = num;
                if (idx == k) break;
            }
        }

        return result;
    }
}