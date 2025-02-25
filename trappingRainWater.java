class Solution {
    public int trap(int[] height) {
        int left = 0,right = height.length-1;
        int leftMax =0 ,rightMax =0;
        int totalMax = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(leftMax < height[left]){
                    leftMax = height[left];
                }
                totalMax+=leftMax-height[left];
                left++;
            }else{
                if(rightMax < height[right]){
                    rightMax = height[right];
                }
                totalMax += rightMax -  height[right];
                right--;
            }
        }
        return totalMax;
    }
}
