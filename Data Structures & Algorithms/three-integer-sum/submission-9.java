class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i ;
        int j;
        int k;
        int sum;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        //for loop to increment i
        for( i =0; i < nums.length - 2; i++){
        //if(check duplicate i)
        if(i > 0 && nums[i] == nums[i-1]){continue;}
        //initialize j & k
        j = i +1;
        k = nums.length -1;
        //while loop inside j < k{}
        while(j < k){

        //calculate sum
        sum = nums[i] + nums[j] + nums[k];
        //check sum if TRUE
        if(sum == 0){
             //add to list
             result.add(Arrays.asList(nums[i], nums[j], nums[k]));
            //j++, k--
            j++;
            k--;
            //check j and k duplicates
            while(j < k && nums[j] == nums[j-1]){j++;}
            while(j < k && nums[k] == nums[k+1]){k--;}
        }

        //else if sum < 0 j++ ONLY becasue I is incrementng and if we i++ we could skip
        else if(sum < 0){j++;}
        //else k--
        else{k--;}
            }//while loop
        }//for loop bracket

        return result;
    }
}
