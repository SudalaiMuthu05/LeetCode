class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> lst = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x)==1){
                lst.add(x);
            }
        }
        // int[] result = lst.stream().mapToInt(Integer::intValue).toArray();
        int[] result = new int[lst.size()];
        int index = 0;
        for(int x : lst){
            result[index++] = x;
        }
        return result;
    }
}