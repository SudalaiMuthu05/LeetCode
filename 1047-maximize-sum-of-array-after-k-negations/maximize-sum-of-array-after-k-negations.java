class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1;
                k--;
            }
        }
        Arrays.sort(nums);
        if (k % 2 != 0) {
            nums[0] *= -1;
        }
        for (int x : nums) {
            sum += x;
        }
        return sum;
    }
}