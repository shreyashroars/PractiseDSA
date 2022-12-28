class Solution {
    public int minStoneSum(int[] piles, int k) {
      PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<piles.length;i++)
           pq.add(piles[i]);
        while(k>0)
        {
           int x=pq.poll();
            pq.add(x-x/2);
            k--;
        }
        
        int sum=0;
       for(int num:pq)
           sum+=num;
        return sum;
        
    }
}