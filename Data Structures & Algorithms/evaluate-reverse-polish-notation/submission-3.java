class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int b = stack.pop();
                int a = stack.pop();
                int result =0;
                switch(token){
                    case "+":
                        result = b + a;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = b * a;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }//switch
                stack.push(result);
            }//if
            else{
                stack.push(Integer.parseInt(token));
            }
        }//for
        return stack.pop();
    }

    public boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
