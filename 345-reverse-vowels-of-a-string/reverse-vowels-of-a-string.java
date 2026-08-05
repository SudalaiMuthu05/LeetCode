class Solution {
    public String reverseVowels(String s) {

        char[] sc = s.toCharArray();
        StringBuffer normal = new StringBuffer();
        StringBuffer vowels = new StringBuffer();

        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == 'A' || sc[i] == 'E' || sc[i] == 'I' || sc[i] == 'O' || sc[i] == 'U'
                    || sc[i] == 'a' || sc[i] == 'e' || sc[i] == 'i' || sc[i] == 'o' || sc[i] == 'u') {

                normal.append('\0');
                vowels.append(sc[i]);

            } else {
                normal.append(sc[i]);
            }
        }
        char[] vow = vowels.reverse().toString().toCharArray();
        char[] norm = normal.toString().toCharArray();
        int index = 0;
        for (int i = 0; i < norm.length; i++) {
            if (norm[i] == '\0') {
                norm[i] = vow[index++];
            }
        }
        return new String(norm);
    }
}