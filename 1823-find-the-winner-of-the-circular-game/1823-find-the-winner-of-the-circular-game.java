class Solution {
    public int findTheWinner(int n, int k) {
    Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++)
            q.offer(i);
        int cnt=k;
        while(q.size()>1)
        {
            int check=q.poll();
            cnt--;
            if(cnt==0)
                cnt=k;
            else
                q.offer(check);
        }
        return q.peek();
        
    }
}