class Solution {
    public long sumAndMultiply(int n) {
        StringBuffer b = new StringBuffer("");
        String s = String.valueOf(n);
        long sum = 0;
        long nonzero = 0;
        long result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                b.append(s.charAt(i));
                sum += Long.valueOf(s.charAt(i) - '0');
            }
        }
        if(b.length()==0){
            return 0;
        }
        nonzero = Long.valueOf(String.valueOf(b));
        result = nonzero * sum * 1L;
        return result;
    }
}