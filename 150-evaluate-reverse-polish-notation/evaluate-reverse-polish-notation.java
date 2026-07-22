class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a = 0;
        int b = 0;
        for (String ch : tokens) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                switch (ch) {
                    case "+":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(a + b);
                        break;

                    case "-":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b - a);
                        break;

                    case "*":
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(a * b);
                        break;

                    case "/":
                        a = stack.pop();
                        b = stack.pop();
                        if (a == 0 || b == 0) {
                            stack.push(0);
                        } else {
                            stack.push(b / a);
                        }
                        break;
                }
            } else {
                stack.push(Integer.valueOf(ch));
            }
        }
        return stack.peek();
    }
}