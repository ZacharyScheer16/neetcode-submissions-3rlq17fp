class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char r : chars){
            if(r == '(' || r == '{' || r == '['){
                stack.push(r);
            }//if
            else if(r == ')' || r == '}' || r == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char compare = stack.pop();
                if((compare != '(' && r == ')') ||
                   (compare != '[' && r == ']')||
                    (compare != '{' && r == '}'))
                {
                    return false;
                }
                
            }
        }


        return stack.isEmpty();
    }
}
