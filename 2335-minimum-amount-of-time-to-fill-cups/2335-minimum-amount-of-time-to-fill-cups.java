class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(amount[0]);
        pq.add(amount[1]);
        pq.add(amount[2]);
        int c=0,y=0,z=0;
        while(!pq.isEmpty())
        {
             y=pq.poll();
            if(pq.peek()!=null)
             z=pq.poll();
            if(y==0 && z==0)
                return c;
            if(y!=0)y=y-1;
            if(z!=0)z=z-1;
            pq.add(y);
            pq.add(z);
            c++;
            y=0;
            z=0;
        }
        return c;
    }
}