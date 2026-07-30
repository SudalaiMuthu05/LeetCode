class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int sum = 0;
        for (int x : set) {
            sum += x;
        }
        int set_size = set.size() + 1;
        int missing_num = Math.abs(sum - (set_size * (set_size + 1)) / 2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int x : map.keySet()) {
            if (map.get(x) > 1) {
                al.add(x);
            }
        }
        int[] res = new int[al.size() + 1];
        int index = 0;
        for (int x : al) {
            res[index++] = x;
        }
        res[index] = missing_num;
        return res;
    }
}