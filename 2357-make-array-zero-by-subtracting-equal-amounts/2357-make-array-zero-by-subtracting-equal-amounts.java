class Solution {
    public int minimumOperations(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
       for(int x:nums) 
       {
           if(x!=0)
           pq.add(x);
       }
        int c=0;
        while(!pq.isEmpty())
        {
            c++;
            int y=pq.poll();
                pq.clear();
           for(int i=0;i<nums.length;i++)
           {
               if(nums[i]!=0)
               {
                   nums[i]-=y;
                   if(nums[i]!=0)
                   pq.add(nums[i]);
               }
           }
        }
        return c;
    }
}