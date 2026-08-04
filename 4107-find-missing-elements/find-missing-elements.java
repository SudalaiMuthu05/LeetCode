class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int start = nums[0];
        int end = nums[nums.length - 1];

        for (int i = start; i <= end; i++) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> lst = new ArrayList<>();
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                lst.add(x);
            }
        }
        Collections.sort(lst);
        return lst;
    }
}