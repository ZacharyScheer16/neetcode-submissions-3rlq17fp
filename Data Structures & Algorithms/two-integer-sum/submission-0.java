class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //base case
        if(nums.length == 0){
            return new int[] {0,0};
        }

        for(int i =0; i < nums.length; i++){
            //number we are searching for = comp
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i], i);

        }//for loop
        return new int[] {0,0};
    }//two sum method
}//class
