class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        
        Collections.sort(list);
        
        int index = 0;
        for (int x : list) {
            nums1[index++] = x;
        }
    }
}