class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int answer = 0;
       int left = 1;
       int right = 0;

        //setting right fr biggestt pile to find mid which is per hour calculation
       for(int pile: piles){
        right = Math.max(right, pile);
       } 

       while(left <= right){
        //curr banas to eat per hour
        int mid = left + (right - left)/2;
        long hours = 0;

        //calculate total hours for current mid
        for(int pile : piles){
            //-1 is to use for carry ver for n rounding errors + this calculates total time to eat
            hours = hours + (pile + mid - 1)/mid;
        }

        //if we can try to get more hours shrink because avg banaa er hour goes down
        if(hours <=h){
            answer = mid;
            right = mid -1;
        }else{
            left = mid + 1;
        }
       }
       return answer;
    }
}
