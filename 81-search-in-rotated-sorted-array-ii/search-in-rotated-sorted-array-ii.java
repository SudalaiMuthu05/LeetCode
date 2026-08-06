class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
        // int start = nums[0];
        // int end = nums[nums.length-1];

        // while(start<end){

        // }
    }

}