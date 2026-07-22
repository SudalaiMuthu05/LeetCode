class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[(nums1.length) + (nums2.length)];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            arr[index++] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            arr[index++] = nums2[j];
        }
        Arrays.sort(arr);
        int mid = arr.length / 2;
        double finall = 0;
        if (arr.length % 2 != 0) {
            finall = arr[mid];
        } else {
            finall = (arr[mid] + arr[mid - 1]) / 2.0;
        }
        return finall;
    }
}