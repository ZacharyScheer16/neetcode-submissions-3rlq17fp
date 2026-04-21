class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
        
    }
    
    public void pop() {

        if(stack.isEmpty()){
            System.err.println("Error: Tried to access an empty stack.");
        }
        
        int compare = stack.peek();
        stack.pop();
        if(compare == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        int result = stack.peek();
        return result;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
