class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return countTriplets(nums1, nums2) + countTriplets(nums2, nums1);
    }

    private int countTriplets(int[] arr1, int[] arr2) {
        Map<Long, Integer> freq = new HashMap<>();
        for (int num : arr2) {
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }

        int count = 0;

        for (int val : arr1) {
            long target = (long) val * val;

            for (Map.Entry<Long, Integer> entry : freq.entrySet()) {
                long j = entry.getKey();
                int countJ = entry.getValue();

                if (target % j == 0) {
                    long k = target / j;

                    if (k < j) {
                        continue;
                    }

                    if (k == j) {
                        count += (int) ((long) countJ * (countJ - 1) / 2);
                    } else if (freq.containsKey(k)) {
                        count += countJ * freq.get(k);
                    }
                }
            }
        }

        return count;
    }
}