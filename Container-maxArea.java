class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0,right = heights.length -1 ;
        while(left < right){
            int minHeight = Math.min(heights[left],heights[right]);
            int width = right - left;
            int area = minHeight * width;
            max = Math.max(max,area);
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return max;
        
    }
}
