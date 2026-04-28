// Last updated: 4/28/2026, 10:46:31 AM
class MinStack {

    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }
    
    public void push(int val) {

  
        if (minStack.isEmpty() || val <= minStack.getLast() ) {
            minStack.add(val);
        }
        stack.add(val);

    }
    
    public void pop() {
        int removed = stack.removeLast();
        if (stack.isEmpty()){
            minStack.clear();
        }
        else{
            if (removed == minStack.getLast()){
                minStack.removeLast();
            }
        }
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        return minStack.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */