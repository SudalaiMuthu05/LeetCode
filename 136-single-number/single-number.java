class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int x : nums){
        //     if(map.containsKey(x)){
        //         map.put(x,map.get(x)+1);
        //     }
        //     else{
        //         map.put(x,1);
        //     }
        // }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            index ^= nums[i];
        }
        return index;
    }
}