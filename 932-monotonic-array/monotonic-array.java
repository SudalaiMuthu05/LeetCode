class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean asc = true;
        boolean des = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                asc = false;
            } 
            if (nums[i] < nums[i + 1]) {
                des = false;
            }
        } 
        return (asc || des);
    }
}