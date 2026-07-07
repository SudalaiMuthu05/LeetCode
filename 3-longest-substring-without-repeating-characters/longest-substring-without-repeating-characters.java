class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int start = 0;
        int max = 0;
        for(int end = 0;end<s.length();end++){
            char c = s.charAt(end);
            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max,(end-start)+1);
        }
        return max;
    }
}