class Solution {
    public int[] findErrorNums(int[] nums) {

        // Set<Integer> set = new HashSet<>();
        // for(int x : nums){
        //     set.add(x);
        // }
        // int sum = 0;
        // for(int x : set){
        //     sum+=x;
        // }
        // int set_size = set.size()+1;
        // int missing_num = Math.abs(sum - (set_size*(set_size+1))/2);

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int x : nums){
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }

        // ArrayList<Integer> al = new ArrayList<>();
        // for(int x : map.keySet()){
        //     if(map.get(x)>1){
        //         al.add(x);
        //     }
        // }

        // int[] res = new int[al.size()+1];
        // int index = 0;
        // for(int x : al){
        //     res[index++] = x;
        // }
        // res[index] = missing_num;
        // return res;

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int x : nums) {
            if (map1.containsKey(x)) {
                map1.put(x, map1.get(x) + 1);
            } else {
                map1.put(x, 1);
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            map2.put(i, map1.getOrDefault(i, 0));
        }

        ArrayList<Integer> lst = new ArrayList<>();
        for (int x : map2.keySet()) {
            if (map2.get(x) > 1) {
                lst.add(x);
            }
        }

        for (int x : map2.keySet()) {
            if (map2.get(x) == 0) {
                lst.add(x);
            }
        }
        int[] arr = new int[lst.size()];
        int index = 0;
        for (int x : lst) {
            arr[index++] = x;
        }
        // Arrays.sort(arr);
        return arr;
    }
}