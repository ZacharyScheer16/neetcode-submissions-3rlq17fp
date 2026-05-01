class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int idx = k;
        int[] result = new int[idx];

        HashMap<Integer, Integer> map = new HashMap<>();

        //add every number in
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0) + 1);
        };

        List<Integer> list = new ArrayList<>(map.keySet());

        

        list.sort((a,b) -> map.get(b) - map.get(a));

        for(int i =0; i < k; i++){
            result[i] = list.get(i);
        }

        return result;
        
    }
}
