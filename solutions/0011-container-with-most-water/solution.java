class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int minHeight = Integer.MAX_VALUE;
        int MaxArea = Integer.MIN_VALUE;
        int width = 0;

        while(left < right){

            minHeight = Math.min(height[left] ,height[right]);
            width = right - left;
            int currArea = minHeight * width;

            MaxArea = Math.max(MaxArea,currArea);

            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }

            
        }
        return MaxArea;
        
    }
}
