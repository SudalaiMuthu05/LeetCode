class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }
        for (int x : nums2) {
            set2.add(x);
        }
        List<Integer> lst = new ArrayList<>();
        set1.retainAll(set2);
        for (int x : set1) {
            lst.add(x);
        }
        int[] result = new int[lst.size()];
        int index = 0;

        for (int x : lst) {
            result[index++] = x;
        }
        return result;
    }
}