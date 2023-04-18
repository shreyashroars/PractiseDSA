class Solution {
   int profit=-2;
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length+1][2];
        dp[prices.length][0]=dp[prices.length][1]=0;
       for(int ind=prices.length-1;ind>=0;ind--)
       {
           for(int buy=0;buy<=1;buy++)
           {
            if(buy==1)
       {
           profit=Math.max(-prices[ind]+dp[ind+1][0]//bought the stock on that day
                           ,0+dp[ind+1][1]//not bought the stock on that day
                          );
    }
    else
    {
        profit=Math.max(prices[ind]+dp[ind+1][1]//bought the stock on that day
                           ,0+dp[ind+1][0]//not bought the stock on that day
                          );
        
    }
        dp[ind][buy]=profit;
       }
       }
           
        
      return dp[0][1];
    }
}