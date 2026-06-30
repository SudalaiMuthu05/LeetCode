class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = 0;

        while (left < right) {
            int len = right - left;
            int heig = Math.min(height[left], height[right]);
            int area = len * heig;

            max_area = Math.max(area, max_area);
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
            
        }
        return max_area;

    }
}