class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();

        int count = 0;
        for (int x : nums) {
            if (x != 0) {
                al.add(x);
                count++;
            }
        }
        int index = 0;
        for (int x : al) {
            nums[index++] = x;
        }

        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}