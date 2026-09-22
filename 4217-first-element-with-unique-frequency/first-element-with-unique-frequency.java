class Solution {
    public int firstUniqueFreq(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int count : freq.values()) {
            freqCount.put(count, freqCount.getOrDefault(count, 0) + 1);
        }

        for (int x : nums) {
            int f = freq.get(x);
            if (freqCount.get(f) == 1) {
                return x;
            }
        }

        return -1;
    }
}