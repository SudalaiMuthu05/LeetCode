class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int[] res = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     int prod = 1;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (i != j ) {
        //             prod = prod * nums[j];
        //         }
        //     }
        //     res[i] = prod;
        // }
        // return res;
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}