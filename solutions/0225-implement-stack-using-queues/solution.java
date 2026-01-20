class MyStack {
    Queue <Integer> q;
    int size;

    public MyStack() {
        q= new LinkedList<>();
           size = 0;
    }
    
    public void push(int x) {
        q.add(x);
        size++;

        for(int i = 0;i<size -1 ;i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        size--;
        return q.remove();
    }
    
    public int top() {
       int temp = q.peek();
       return temp;
    }
    
    public boolean empty() {
        if(size == 0) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
