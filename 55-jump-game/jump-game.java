class Solution {
    public boolean canJump(int[] nums) {

        int step_left = nums[0];
        for (int i = 1; i < nums.length; i++) {
            step_left--;
            if (step_left < 0)
                return false;
            if (i == nums.length - 1)
                return true;
            if (step_left < nums[i]) {
                step_left = nums[i];
            }
        }
        return true;
    }
}

// int reachable = 0;
// for (int i = 0; i < nums.length; i++) {
//     if (i > reachable)
//         return false;
//     reachable = Math.max(reachable, i + nums[i]);
// }
// return true;