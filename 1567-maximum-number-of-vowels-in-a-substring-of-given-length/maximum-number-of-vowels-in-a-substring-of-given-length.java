class Solution {
    public int maxVowels(String s, int k) {
        // int n = s.length();
        // int count = 0, maxcount = 0;
        // for (int i = 0; i <= n - k; i++) {
        //     count = 0;
        //     for (int j = i; j < i + k; j++) {
        //         char ch = s.charAt(j);
        //         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //             count++;
        //         }
        //         maxcount = Math.max(maxcount, count);
        //     }

        // }
        // return maxcount;

        int maxcount = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowels(s.charAt(i))) {
                count++;
            }
        }
        maxcount = count;

        for (int i = k; i < s.length(); i++) {
            if (isVowels(s.charAt(i))) {
                count++;
            }
            if (isVowels(s.charAt(i - k))) {
                count--;
            }
            maxcount = Math.max(maxcount, count);

            if (maxcount == k)
                return k;

        }
        return maxcount;
    }

    public boolean isVowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}