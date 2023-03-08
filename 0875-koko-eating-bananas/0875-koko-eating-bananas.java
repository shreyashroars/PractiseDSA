class Solution {
    public long  timeToeatAll(int[]piles,int y)
    {
        long sum=0;
         for(int j=0;j<piles.length;j++)
           {
               sum+=(int)Math.ceil(piles[j]/(double)y);
           }
           return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans=0,max=-1;
        for(int x:piles)
            max=Math.max(max,x);
        int low=1,high=max;
      while(low<=high)
      {
          int mid=low+(high-low)/2;
           if(timeToeatAll(piles,mid)<=(long)h)
          {
              ans=mid;
              high=mid-1;
          }
          else
              low=mid+1;        
      }
        return ans;
    }
}