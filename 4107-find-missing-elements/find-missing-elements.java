class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = min; i <= max; i++) {
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