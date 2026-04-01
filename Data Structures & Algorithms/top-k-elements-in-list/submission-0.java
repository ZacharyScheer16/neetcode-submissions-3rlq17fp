class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //establish  hash map
        HashMap<Integer, Integer> map = new HashMap<>();
        //assign values to key-value pair
        for(int i =0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) ->
        map.get(b) - map.get(a));

        int result[] = new int [k];
        int index = 0;
        for(int i =0;i < k; i++ ){
            result[index] = list.get(i);
            index++;
        } 
        return result;
    }
}
