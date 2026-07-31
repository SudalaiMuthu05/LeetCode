class Solution {
    public String largestNumber(int[] nums) {

        String[] num = new String[nums.length];
        int index = 0;
        StringBuffer bf = new StringBuffer();

        for (int x : nums) {
            num[index++] = String.valueOf(x);
        }
        Arrays.sort(num, (a, b) -> (b + a).compareTo(a + b));

        if (num[0].equals("0")) {
            return "0";
        }
        else{

            for (String x : num) {
                bf.append(x);
            }
        }
        return bf.toString();
    }
}