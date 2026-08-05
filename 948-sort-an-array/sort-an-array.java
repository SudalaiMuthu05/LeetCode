import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums, n);
        return nums;
    }

    public static void mergeSort(int[] nums, int n) {
        if (nums.length < 2) {
            return;
        }
        int mid = nums.length / 2;
        int[] leftarr = new int[mid];
        int[] rightarr = new int[nums.length - mid];
        for (int i = 0; i < mid; i++) {
            leftarr[i] = nums[i];
        }
        int k = 0;
        for (int i = mid; i < nums.length; i++) {
            rightarr[k] = nums[i];
            k++;
        }
        mergeSort(leftarr, leftarr.length);
        mergeSort(rightarr, rightarr.length);
        merge(nums, leftarr, rightarr);
    }

    public static void merge(int[] nums, int[] leftarr, int[] rightarr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftarr.length && j < rightarr.length) {
            if (leftarr[i] < rightarr[j]) {
                nums[k] = leftarr[i];
                i++;
            } else {
                nums[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i < leftarr.length) {
            nums[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < rightarr.length) {
            nums[k] = rightarr[j];
            j++;
            k++;
        }
    }
}