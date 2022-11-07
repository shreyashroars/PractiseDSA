class CustomStack {
int size;
int stack[];
    int top;
    public CustomStack(int maxSize) 
    {
      size=maxSize;
     stack=new int[size];
        top=-1;
    }
    
    public void push(int x) {
        if(top<size-1)
        {
            stack[++top]=x;
        }
    }
    
    public int pop() {
        if(top!=-1)
       return stack[top--];
        else
            return -1;
    }
    
    public void increment(int k, int val) {
       if(stack.length == 0) return;
        for(int i = 0;i<k && i<stack.length;i++)
            stack[i] = stack[i] + val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */