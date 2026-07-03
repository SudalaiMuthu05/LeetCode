class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;
        int size = nums.length;
        int calc = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        calc = size * (size + 1) / 2;
        int missing = calc - sum;

        return missing;
    }
}