class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = n - k; i < n; i++) {
            al.add(nums[i]);
        }
        for (int i = 0; i < n - k; i++) {
            al.add(nums[i]);
        }
        int index = 0;
        for (int x : al) {
            nums[index++] = x;
        }
    }
}