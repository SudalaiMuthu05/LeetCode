class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        List<Map.Entry<String, Integer>> arr_list = new ArrayList<>(map.entrySet());

        Collections.sort(arr_list, (a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });

        List<String> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(arr_list.get(i).getKey());
        }
        return result;
    }
}