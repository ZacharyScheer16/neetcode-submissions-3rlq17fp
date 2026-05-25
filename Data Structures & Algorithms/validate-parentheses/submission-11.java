class Solution {
    public boolean isValid(String s) {
        // create stack
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){stack.push(c);}
        //checking forwards
        //must be backwards
        else{
            //nothing to compare to
            if(stack.isEmpty()){return false;}

            //check if c mathes most recent in stack
            if((c == ']' && stack.peek() != '[')
               || (c == '}' && stack.peek() != '{')
               || (c == ')' && stack.peek() != '(')
            ){
                return false;
        }

        stack.pop();
        }
    }

    return stack.isEmpty();
}
}
