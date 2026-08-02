class Solution {
    public int findMiddleIndex(int[] nums) {
        int left_sum = 0;
        int right_sum = 0;
        int total = 0;

        for (int x : nums) {
            total += x;
        }

        for (int i = 0; i < nums.length; i++) {
            right_sum = total - left_sum - nums[i];

            if (left_sum == right_sum) {
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }
}