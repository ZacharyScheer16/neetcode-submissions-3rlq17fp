class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens ){
            if (token.equals("+") || token.equals("-") ||
            token.equals("*") || token.equals("/")) {       
                int b = stack.pop(); //right operand
                int a = stack.pop(); //left operand

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // truncates toward zero
                        break;
                }
             }//if loop
             else{
                stack.push(Integer.parseInt(token));
             }
        
    }//for loop

    return stack.pop();
}//method
}//class
