class Solution {
    public int largestAltitude(int[] gain) {
        int start = gain[0];
        int current_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < gain.length; i++) {
            current_sum += gain[i];
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}