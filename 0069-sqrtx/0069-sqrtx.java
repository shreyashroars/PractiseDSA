class Solution {
    public int mySqrt(int x) {
          long ans=0;
        if(x==1)
            return 1;
      
        else
        {
            int y=x/2;
            long low=1,high=y;
            while(low<=high)
            {
                long mid=(high-low)/2+low;
                if(mid*mid==x)
                {
                    System.out.println(mid);
                    return (int)mid;
                }
                else if(mid*mid<x)
                {
                    ans=mid;
                    System.out.println(ans);
                    low=mid+1;
                }
                else
                    high=mid-1;
                    
            }
         
            return (int)ans;
        }
        
    }
}