class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount = new int[k];
        
        remainderCount[0] = 1;
        
        int count = 0;
        int curr_sum = 0;
        
        for (int num : nums) {
            curr_sum += num;
            
            int rem = curr_sum % k;
            if (rem < 0) {
                rem += k; 
            }
            count += remainderCount[rem];
            
            remainderCount[rem]++;
        }
        return count;
    }
}