class MyQueue {
   Stack<Integer>front;
   Stack<Integer>rear;
    public MyQueue() {
      front=new Stack<>();
      rear=new Stack<>();  
    }
    
    public void push(int x) {
        rear.push(x);
    }
    
    public int pop() {
        if(rear.isEmpty()&& front.isEmpty()){
            return -1;
        }
        if(front.isEmpty()){
            while(!rear.isEmpty()){
             front.push(rear.pop());
            }
        return front.pop();
        }
        return front.pop();
    }
    
    public int peek() {
        while(rear.isEmpty()&& front.isEmpty()){
            return -1;
        }
        if(front.isEmpty()){
            while(!rear.isEmpty()){
             front.push(rear.pop());
            }
        return front.peek();
        }
        return front.peek();
    }
    
    
    public boolean empty() {
         return  (rear.isEmpty()&& front.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */