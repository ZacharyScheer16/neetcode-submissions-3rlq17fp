class Solution {
    public boolean isValid(String s) {
        // stack 
        Stack<Character> stack = new Stack<>();

        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' ||c == '('|| c == '{' ){
                stack.push(c);
            }
            else if(c == ']' ||c == ')'|| c == '}' ){

                if(stack.isEmpty()){return false;}

                char popped = stack.pop(); // [ { ()}]
                if(
                    (popped == '[' && c ==']' ) ||
                    (popped == '{' && c =='}' ) ||
                    (popped == '(' && c ==')' )
                ){
                    continue;
                }
                else{return false;}
                

            }
            else return false;

        }
        return stack.isEmpty();
        
    }
}
