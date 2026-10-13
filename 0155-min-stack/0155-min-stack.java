class MinStack {
    class Node{
        int val;
        int min;
        Node(int v, int min){
            this.val=v;
            this.min=min;
        }
    }
    Stack<Node> st;

    public MinStack() {
     st = new Stack<>();   
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(new Node(value,value));
        }
        else{
            if(value<st.peek().min){
             st.push(new Node(value,value));   
            }
            else{
              st.push(new Node(value,st.peek().min));  
            }
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        else{
            st.pop();
        }
        
    }
    
    public int top() {
     return   st.peek().val;
    }
    
    public int getMin() {
      return st.peek().min;  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */