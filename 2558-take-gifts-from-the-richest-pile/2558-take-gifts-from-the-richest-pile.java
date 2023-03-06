class Solution {
    public long pickGifts(int[] gifts, int k) {
      PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:gifts)
            pq.add(x);
        while(k-->0)
        {
            int y=pq.poll();
            pq.add((int)Math.sqrt(y));
        }
        long sum=0;
        while(!pq.isEmpty())
            sum+=pq.poll();
        return sum;
        
    }
}