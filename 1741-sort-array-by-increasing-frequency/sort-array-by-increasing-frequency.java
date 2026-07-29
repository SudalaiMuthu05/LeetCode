class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(map.entrySet());

        Collections.sort(lst, (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return b.getKey().compareTo(a.getKey());
            }
            return a.getValue() - b.getValue();
        });

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> x : lst) {
            for (int i = 0; i < x.getValue(); i++) {
                res.add(x.getKey());
            }
        }
        int[] result = new int[res.size()];
        int index = 0;
        for (int x : res) {
            result[index++] = x;
        }
        return result;
    }
}