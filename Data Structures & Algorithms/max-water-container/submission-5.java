class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        //left and right
        int left = 0;
        int right = heights.length -1;
        while(left < right) {
        //min heoght and use indices as length
        int minHeight = Math.min(heights[left], heights[right]);
        int width = right - left;
        int area = width * minHeight;
        //new maxArea (potnetially)
        maxArea = Math.max(area, maxArea);

        //how do we increment
        if(heights[left] > heights[right]){
            right--;
        }else{
            left++;
          }
        //area and minheight 
        }
        return maxArea;
    }
}
