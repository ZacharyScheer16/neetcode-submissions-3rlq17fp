class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while(left < right){

            //width = length
            int width = right - left;
            int minHeight = Math.min(height[right], height[left]);
            int currentArea = width *  minHeight;

            maxArea = Math.max(currentArea, maxArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
        
    }
}
