class Solution {
    public int maxArea(int[] heights) {
        int length;
        int area;
        int maxArea =0;

        int left = 0;
        int right = heights.length -1;

        while(left < right){
            length = right - left;
            int height = Math.min(heights[left], heights[right]);
            area = height * length;
            maxArea = Math.max(area, maxArea);

            if(heights[left] > heights[right]){
                right--;
            } else{
                left++;
            }
        }

        return maxArea;
        
    }
}
