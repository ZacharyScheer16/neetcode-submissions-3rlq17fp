class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area;
        int maxArea = 0;

        while(left < right){
            int minHeight = Math.min(heights[left], heights[right]);
            int length = right - left;

            area = minHeight * length;

            maxArea = Math.max(area, maxArea);
            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
      }

      return maxArea;
        
    }
}
