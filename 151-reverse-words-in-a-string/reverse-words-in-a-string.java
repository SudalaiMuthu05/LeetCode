class Solution {
    public String reverseWords(String s) {
        String[] strarr = s.split(" ");
        StringBuffer sb = new StringBuffer("");
        for (int i = strarr.length - 1; i >= 0; i--) {
            if (!strarr[i].equals("")) {
                sb.append(strarr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}