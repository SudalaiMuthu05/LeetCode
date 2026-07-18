class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length <= 2){
            return nums;
        }
        ArrayList<Integer> even_arr = new ArrayList<>();
        ArrayList<Integer> odd_arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even_arr.add(nums[i]);
            } else {
                odd_arr.add(nums[i]);
            }
        }
        Collections.sort(even_arr);
        Collections.sort(odd_arr, Collections.reverseOrder());

        int even_index = 0;
        int odd_index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even_arr.get(even_index++);
            } else {
                nums[i] = odd_arr.get(odd_index++);
            }
        }
        return nums;
    }
}