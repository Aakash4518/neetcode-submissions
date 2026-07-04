class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxwater = 0;
        while(i < j){
            int width = j - i;
            int minHeight = Math.min(height[i], height[j]);
            int currentArea = width * minHeight;
            maxwater = Math.max(maxwater, currentArea);
            if(height[i] < height[j]) i++;
            else j--;

        }
        return maxwater;
    }
}