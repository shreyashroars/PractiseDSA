class Solution {
   int profit=-2;
    public int maxProfit(int[] prices) {
       
        int ahead[]=new int[2];
        int curr[]=new int[2];
        ahead[0]=ahead[1]=0;
       for(int ind=prices.length-1;ind>=0;ind--)
       {
           for(int buy=0;buy<=1;buy++)
           {
            if(buy==1)
       {
           profit=Math.max(-prices[ind]+ahead[0]//bought the stock on that day
                           ,0+ahead[1]//not bought the stock on that day
                          );
    }
    else
    {
        profit=Math.max(prices[ind]+ahead[1]//bought the stock on that day
                           ,0+ahead[0]//not bought the stock on that day
                          );
        
    }
       curr[buy]=profit;
       }
          ahead=curr;
       }
           
        
      return ahead[1];
    }
}