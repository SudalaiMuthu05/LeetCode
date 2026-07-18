import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        SortedSet<Integer> sort = new TreeSet<>(map.values());

        Integer[] freq = sort.toArray(new Integer[0]);

        int[] result = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i >= 0; i--) {
            int current = freq[i];
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(current)) {
                    result[index++] = entry.getKey();
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}