class Solution {
    public int findPeakElement(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            max = Math.max(x, max);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                return i;
            }
        }
        return 0;
    }
}