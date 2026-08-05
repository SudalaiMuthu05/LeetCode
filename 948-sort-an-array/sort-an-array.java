class Solution {
    public static void Merge(int[] arr, int n) {

        if (n < 2) {
            return;
        }
        int start = 0;
        int end = n;
        int mid = (start + end) / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < end; i++) {
            right[i - mid] = arr[i];
        }
        Merge(arr, mid);
        Merge(left, mid);
        Merge(right, n - mid);
        MergeSort(arr, left, right, mid, n - mid);
    }

    public static void MergeSort(int[] arr, int[] left_arr, int[] right_arr, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (left_arr[i] < right_arr[j]) {
                arr[k++] = left_arr[i++];
            } else {
                arr[k++] = right_arr[j++];
            }
        }
        while (i < left) {
            arr[k++] = left_arr[i++];
        }
        while (j < right) {
            arr[k++] = right_arr[j++];
        }
    }

    public int[] sortArray(int[] nums) {

        Merge(nums, nums.length);
        return nums;

    }
}