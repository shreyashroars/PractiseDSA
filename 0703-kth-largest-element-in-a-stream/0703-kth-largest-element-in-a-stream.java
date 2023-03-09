class KthLargest {
int arr[];
int k;
PriorityQueue<Integer>pq=new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        arr=nums;
        this.k=k;
        for(int x:arr)
            pq.add(x); 
        while(pq.size()>k)
            pq.poll();
    }
    
    public int add(int val) {
       pq.add(val);
        if(pq.size()>k)
            pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */