class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
    }
    
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> map.get(b)- map.get(a));

        int[] result = new int [k];
        int idx = 0;
        for(int i =0; i < k; i++){
            result[idx] = list.get(i);
            idx++;
        }
        return result;
    }
}
