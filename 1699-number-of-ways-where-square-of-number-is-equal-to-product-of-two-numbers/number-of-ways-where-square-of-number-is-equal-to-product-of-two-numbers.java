class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return countType(nums1, nums2) + countType(nums2, nums1);
    }
    private int countType(int[] arr1, int[] arr2) {
        Map<Long, Integer> productCount = new HashMap<>();
        
        for (int j = 0; j < arr2.length; j++) {
            for (int k = j + 1; k < arr2.length; k++) {
                long prod = (long) arr2[j] * arr2[k];
                productCount.put(prod, productCount.getOrDefault(prod, 0) + 1);
            }
        }
        int total = 0;
        for (int val : arr1) {
            long square = (long) val * val;
            total += productCount.getOrDefault(square, 0);
        }
        return total;
    }
}