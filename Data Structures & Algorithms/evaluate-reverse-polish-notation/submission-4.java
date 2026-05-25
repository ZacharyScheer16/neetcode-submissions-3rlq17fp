class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            switch (token) {

                case "+":
                    int add1 = stack.pop();
                    int add2 = stack.pop();
                    stack.push(add2 + add1);
                    break;

                case "-":
                    int sub1 = stack.pop();
                    int sub2 = stack.pop();
                    stack.push(sub2 - sub1);
                    break;

                case "*":
                    int mul1 = stack.pop();
                    int mul2 = stack.pop();
                    stack.push(mul2 * mul1);
                    break;

                case "/":
                    int div1 = stack.pop();
                    int div2 = stack.pop();
                    stack.push(div2 / div1);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}