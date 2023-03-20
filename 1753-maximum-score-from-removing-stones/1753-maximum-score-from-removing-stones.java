class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        q.add(a);
        q.add(b);
        q.add(c);
        int ans=0;
        while(q.peek()!=0)
        {
            int u=q.poll();
            if(q.peek()==0)
                return ans;
            else
                q.add(u);
            ans++;
             a=q.poll();
            b=q.poll();
            q.add(a-1);
            q.add(b-1);
        }
        return ans;
    }
}