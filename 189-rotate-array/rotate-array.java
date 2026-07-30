class Solution {
    public void rotate(int[] nums, int k) {

        k = k%nums.length;

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=nums.length-k;i<nums.length;i++){
            al.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            al.add(nums[i]);
        }
        // int[] res = new int[al.size()];
        int index = 0;
        for(int x : al){
            nums[index++] = x;
        }
    }   
}