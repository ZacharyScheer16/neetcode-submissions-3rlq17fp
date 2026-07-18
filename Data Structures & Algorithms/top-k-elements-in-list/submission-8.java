class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket array: index = frequency
        List<Integer>[] bucket = new List[nums.length + 1];

        //add into bucket
        for(int num: map.keySet()){
            int number = map.get(num);

            if(bucket[number] == null){
                bucket[number] = new ArrayList<>();
            }
            bucket[number].add(num);
        }

        int[] result = new int[k];
        int idx = 0;
        for(int i = bucket.length -1; i >= 0; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    result[idx] = num;
                    idx++;
                    if(idx == k){
                        return result;
                    }
            }//inner for
        }//if loop
     }//for i = length


        return result;
    }
}