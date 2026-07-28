class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] string_arr = path.split("/");
        for (String ch : string_arr) {
            if (ch.equals("") || ch.equals(".")) {
                continue;
            }
            if (ch.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/");
            sb.append(s);
        }
        if (!stack.isEmpty()) {
            return new String(sb);
        }
        return new String("/");
    }
}