class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        // ArrayList<Integer> al = new ArrayList<>();
        // for (int x : map.values()) {
        //     al.add(x);
        // }
        HashSet<Integer> set = new HashSet<>();
        for (int x : map.values()) {
            set.add(x);
        }
        if (map.size() == set.size()) {
            return true;
        }
        return false;
    }
}