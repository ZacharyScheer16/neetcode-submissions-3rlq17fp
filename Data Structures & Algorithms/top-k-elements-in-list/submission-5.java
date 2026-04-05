class Solution {
    public int[] topKFrequent(int[] nums, int k) {
              //num      freq value
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //set Frequency 
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //create list with sets
        List<Integer> list = new ArrayList<>(map.keySet());
        //lambda descending order function  list(a,b) -> list.get(b) -(a)
        list.sort((a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];

        for(int i =0; i < k; i++){
            result[i] = list.get(i);
        }
        return result;  
        //int idx = 0;
    }
}
